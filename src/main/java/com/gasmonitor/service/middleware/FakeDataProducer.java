package com.gasmonitor.service.middleware;

import com.gasmonitor.service.middleware.api.WsClientPoolApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * Created by saplmm on 2017/6/12.
 */
//@Service
public class FakeDataProducer implements CommandLineRunner {
    Logger log = LoggerFactory.getLogger(FakeDataProducer.class);

    @Autowired
    public WsClientPoolApi wsClientPoolApi;

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
