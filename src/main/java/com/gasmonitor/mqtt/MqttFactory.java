package com.gasmonitor.mqtt;

import org.fusesource.mqtt.client.MQTT;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;

import java.net.URISyntaxException;

/**
 * Created by 王萍 on 2017/6/14 0014.
 */
public class MqttFactory {

    private static Logger logger = LoggerFactory.getLogger(MqttFactory.class);

    public static MQTT getInstance(@Value("${gasmonitor.mqtt.user}") String user,
                                   @Value("${gasmonitor.mqtt.password}") String password,
                                   @Value("${gasmonitor.mqtt.host}") String host,
                                   @Value("${gasmonitor.mqtt.port}") int port) {

        MQTT mqtt = new MQTT();
        try {
            mqtt.setHost(host, port);
        } catch (URISyntaxException e) {
            logger.info("mqtt设置host不成功");
            e.printStackTrace();
        }
        mqtt.setUserName(user);
        mqtt.setPassword(password);

        return mqtt;
    }
}
