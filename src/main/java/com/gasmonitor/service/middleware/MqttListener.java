package com.gasmonitor.service.middleware;

import com.gasmonitor.protobuf.GasMsg;
import com.gasmonitor.service.websocket.api.MqttConnection;
import com.gasmonitor.service.middleware.api.WsClientPoolApi;
import com.gasmonitor.utils.GasDataUtil;
import org.fusesource.hawtbuf.Buffer;
import org.fusesource.hawtbuf.UTF8Buffer;
import org.fusesource.mqtt.client.*;
import org.influxdb.InfluxDB;
import org.influxdb.InfluxDBFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;

import java.net.URISyntaxException;

/**
 * Created by saplmm on 2017/6/12.
 */

//mqtt的服务 暂时不需要了
//@Service

public class MqttListener implements CommandLineRunner {

    @Autowired
    public WsClientPoolApi wsClientPoolApi;

    private Logger logger = LoggerFactory.getLogger(MqttListener.class);

    final GasDataUtil gasDataUtil = new GasDataUtil();

    final String destinationReceive = "/gasevent";
    final String destinationSend = "/gasmonitor";

    //这里的@Value 注解暂时没有起作用

    @Value("${gasmonitor.mqtt.host}")
    private String gasmonitorMqttHost = "www.dongzhile.cn";

    @Value("${gasmonitor.mqtt.user}")
    private String gasmonitorMqttUser = "admin";

    @Value("${gasmonitor.mqtt.password")
    private String gasmonitorMqttPassword = "password";

    @Value("${gasmonitor.influxdb.url}")
    private String gasmonitorInfluxdbUrl = "http://www.dongzhile.cn:8086";

    @Value("${gasmonitor.influxdb.password}")
    private String gasmonitorInfluxdbPassword = "root";

    @Value("${gasmonitor.influxdb.username}")
    private String gasmonitorInfluxdbUsername = "root";


    private CallbackConnection connection;
    private FutureConnection futureConnection;

    private MQTT mqttReceive = new MQTT();
    private MQTT mqttSender = new MQTT();

    private InfluxDB influxDB;

    //influxdb数据库表名
    private final static String TABLENAME = "gastable";
    //influxdb数据库库名
    private final static String DBNAME = "gasdb";

    //    构造函数
    private MqttListener() {
        logger.info("MqttListener()");

        influxDB = InfluxDBFactory.connect(
                gasmonitorInfluxdbUrl,
                gasmonitorInfluxdbPassword,
                gasmonitorInfluxdbUsername);

        influxDB.createDatabase(DBNAME);

        config(mqttReceive, gasmonitorMqttUser, gasmonitorMqttPassword, gasmonitorMqttHost, 61613);
        mqttReceive.setCleanSession(true);
        mqttReceive.setReconnectAttemptsMax(MqttConnection.RECONNECTION_ATTEMPT_MAX);
        mqttReceive.setReconnectDelay(MqttConnection.RECONNECTION_DELAY);
        connection = mqttReceive.callbackConnection();

        config(mqttSender, gasmonitorMqttUser, gasmonitorMqttPassword, gasmonitorMqttHost, 61613);
        futureConnection = mqttSender.futureConnection();
        try {
            logger.info("before connect().await()");
            futureConnection.connect().await();
            logger.info("after connect().await()");
        } catch (Exception e) {
            logger.info("连接消息服务器error");
            e.printStackTrace();
        }

    }

    public void config(MQTT mqtt, String user, String password, String host, int port) {
        try {
            logger.info("config({},{},{},{},{})", mqtt, user, password, host, port);
            mqtt.setHost(host, port);
            mqtt.setUserName(user);
            mqtt.setPassword(password);
        } catch (URISyntaxException e) {
            System.out.println("无法连接主机");
            e.printStackTrace();
        }

    }

    public void connect() {
        connection.connect(new Callback<Void>() {
            public void onSuccess(Void value) {
                Topic[] topics = {new Topic(destinationReceive, QoS.EXACTLY_ONCE)};

                connection.subscribe(topics, new Callback<byte[]>() {
                    public void onSuccess(byte[] qoses) {
                        logger.info("订阅成功");
                    }

                    public void onFailure(Throwable value) {
                        value.printStackTrace();
                        System.exit(-2);
                    }
                });
            }

            public void onFailure(Throwable value) {
                value.printStackTrace();
                System.exit(-2);
            }
        });
    }

    public void listener() {
        connection.listener(new Listener() {

            public void onConnected() {
            }

            public void onDisconnected() {
            }

            public void onFailure(Throwable value) {
                value.printStackTrace();
                System.exit(-2);
            }

            public void onPublish(UTF8Buffer topic, Buffer msg, Runnable ack) {
                byte[] data = msg.toByteArray();
                GasMsg.GasData gasData = gasDataUtil.consume(data);


                StringBuilder builder = new StringBuilder(100);
                builder.append("{")
                        .append("\"hardware\":").append(gasData.getHardware()).append(",")
                        .append("\"pointTime\":").append(gasData.getPointTime()).append(" ")    //不能写成time，因为是Influxdb占用的字段
                        .append("\"pressure\":").append(gasData.getPressure()).append(",")
                        .append("\"temperature\":").append(gasData.getTemperature()).append(",")
                        .append("\"standardFlow\":").append(gasData.getStandardFlow()).append(",")
                        .append("\"workFlow\":").append(gasData.getWorkFlow()).append(",")
                        .append("\"sumFlow\":").append(gasData.getSumFlow());
                wsClientPoolApi.sendMonitorData(builder.toString());
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
    public void run(String... strings) throws Exception {
        this.connect();
        this.listener();
    }
}
