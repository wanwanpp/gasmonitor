package com.gasmonitor.mqtt;

import com.gasmonitor.service.protobuf.Sitewhere;
import com.gasmonitor.utils.GasDataUtil;
import com.gasmonitor.websocket.SocketHandler;
import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.*;
import org.influxdb.InfluxDB;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationPreparedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.List;
import java.util.Observable;

public class MqttListener extends Observable implements MqttConnectionCycle, ApplicationListener<ApplicationPreparedEvent> {

    @Autowired
    private InfluxDB influxDB;

    private Logger logger = LoggerFactory.getLogger(MqttListener.class);
    final GasDataUtil gasDataUtil = new GasDataUtil();
    private MQTT mqtt = new MQTT();
    private CallbackConnection connection;

    private final static String DESTINATION = "/topic/event";
    private final static short KEEP_ALIVE = 30;// 低耗网络，但是又需要及时获取数据，心跳30s
    //    public static Topic[] topics = {new Topic("mqtt", QoS.EXACTLY_ONCE)};
    public final static long RECONNECTION_ATTEMPT_MAX = 6;
    public final static long RECONNECTION_DELAY = 20;
    public final static int SEND_BUFFER_SIZE = 2 * 1024 * 1024;// 发送最大缓冲为2M

    //influxdb数据库表名
    // TODO: 2017/6/13 0013 这里的表名需要改成租户唯一的
    private final static String TABLENAME = "gastable";
    private final static String DBNAME ="gasdb";

    //    构造函数
    private MqttListener() {
        config("admin", "password", "localhost", 61613);
    }

    //    使用单例模式
    private static class Hoder {
        private static MqttListener singleListener = new MqttListener();
    }

    public static MqttListener getInstance() {
        return Hoder.singleListener;
    }

//    public MqttListener(String user, String password, String host, int port) {
//        config(user, password, host, port);
//    }

    public void config(String user, String password, String host, int port) {
        try {
            mqtt.setHost(host, port);
        } catch (URISyntaxException e) {
            System.out.println("无法连接主机");
            e.printStackTrace();
        }
        mqtt.setUserName(user);
        mqtt.setPassword(password);

//        连接前清空会话信息
        mqtt.setCleanSession(true);
        mqtt.setReconnectAttemptsMax(RECONNECTION_ATTEMPT_MAX);
        mqtt.setReconnectDelay(RECONNECTION_DELAY);
//        mqtt.setKeepAlive(KEEP_ALIVE);
//        mqtt.setSendBufferSize(SEND_BUFFER_SIZE);
        connection = mqtt.callbackConnection();
    }

    public void connect() {
        connection.connect(new Callback<Void>() {
            public void onSuccess(Void value) {

                logger.info("连接成功");
                Topic[] topics = {new Topic(DESTINATION, QoS.AT_LEAST_ONCE)};

                connection.subscribe(topics, new Callback<byte[]>() {
                    public void onSuccess(byte[] qoses) {
                        System.out.println("订阅成功");
                        logger.info("订阅成功");
                    }

                    public void onFailure(Throwable value) {
                        logger.info("订阅失败");
                    }
                });
            }

            public void onFailure(Throwable value) {
                logger.info("连接失败");
            }
        });
    }

    public void listener() {
        connection.listener(new Listener() {

            public void onConnected() {
                // 监听到连接成功
                logger.info("connected");
            }

            public void onDisconnected() {
                // 监听到断开连接
                logger.info("disconnected");
                // TODO: 2017/6/14 0014 加入断开连接邮件通知功能
            }

            public void onFailure(Throwable value) {
//                监听失败
                logger.info("listen failed");
            }

            public void onPublish(UTF8Buffer topic, Buffer msg, Runnable ack) {
                byte[] data = msg.toByteArray();
                Sitewhere.Model.DeviceMeasurements consume = gasDataUtil.consume(data);

                List<WebSocketSession> sessions = SocketHandler.sessions;
                if (sessions.size() > 0) {
                    for (WebSocketSession session : sessions) {
                        try {
                            session.sendMessage(new TextMessage(consume.toString()));
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                }

                List<Sitewhere.Model.Measurement> measurementList = consume.getMeasurementList();

                String string = TABLENAME + "," +
                        "hardware=" + consume.getHardwareId() + "," +
                        "pointTime=" + measurementList.get(5).getMeasurementValue() + " " +    //不能写成time，因为是Influxdb占用的字段
                        "pressure=" + measurementList.get(0).getMeasurementValue() + "," +
                        "temperature=" + measurementList.get(1).getMeasurementValue() + "," +
                        "standardFlow=" + measurementList.get(2).getMeasurementValue() + "," +
                        "workFlow=" + measurementList.get(3).getMeasurementValue() + "," +
                        "sumFlow=" + measurementList.get(4).getMeasurementValue();

                //写入数据库
                // TODO: 2017/6/13 0013 使用批量写入
                influxDB.write(DBNAME,"autogen", InfluxDB.ConsistencyLevel.ONE,string);
            }
        });

    }

    public void disconnect() {
        connection.disconnect(new Callback<Void>() {
            public void onSuccess(Void value) {
                System.out.println("收到断开指令，关闭连接");
                System.exit(0);
            }

            public void onFailure(Throwable value) {
                value.printStackTrace();
                System.exit(-2);
            }
        });
    }


    @Override
    public void onApplicationEvent(ApplicationPreparedEvent applicationPreparedEvent) {

        MqttListener mqttListener = getInstance();
        logger.info("配置好mqttlistener");
        mqttListener.connect();
        logger.info("mqttlistener连接成功");
        mqttListener.listener();
        logger.info("mqttlistener开始监听");
    }
}
