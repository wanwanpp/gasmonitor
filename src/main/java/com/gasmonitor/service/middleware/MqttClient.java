package com.gasmonitor.service.middleware;

import com.gasmonitor.service.websocket.WsClientPool;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;

/**
 * Created by saplmm on 2017/6/12.
 */
//mqtt 的client暂时不需要了
//@Service
public class MqttClient implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(MqttClient.class);

    @Autowired
    public WsClientPool wsClientPoolApi;

    @Override
    public void run(String... strings) throws Exception {
        log.info("开始执行myqqClient.run()...");
        for (int i = 0; i < 100000; i++) {
            try {
                Thread.sleep(10000);
                wsClientPoolApi.sendMonitorData("测试数据...");
            } catch (Exception e) {
            }
        }
    }
}
