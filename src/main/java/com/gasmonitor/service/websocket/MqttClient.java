package com.gasmonitor.service.websocket;

import com.gasmonitor.service.websocket.api.WsClientPoolApi;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * Created by saplmm on 2017/6/12.
 */

//@Service
public class MqttClient implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(MqttClient.class);

    @Autowired
    public WsClientPoolApi wsClientPoolApi;


    @Override
    public void run(String... strings) throws Exception {
        log.info("开始执行myqqClient.run()...");
        for (int i = 0; i < 100000; i++) {
            try {
                Thread.sleep(10000);
                MonitorData msg = new MonitorData("s1", "msg...");
                wsClientPoolApi.sendMonitorData(msg);
            } catch (Exception e) {
            }
        }
    }
}
