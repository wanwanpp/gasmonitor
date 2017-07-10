package com.gasmonitor.service.middleware;

import com.gasmonitor.entity.GasEvent;
import com.gasmonitor.entity.GasHazelcast;
import com.gasmonitor.service.middleware.api.WsClientPoolApi;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * Created by saplmm on 2017/6/12.
 */
@Service
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
                // wsClientPoolApi.sendMonitorData("测试数据...");

                // Start: 发送 hazel 的测试数据
                GasHazelcast hazelcastEvent = new GasHazelcast();
                hazelcastEvent.setTenantId("test tenantId");
                GasEvent gasEvent = new GasEvent();
                gasEvent.setHardwareId("s2");
                gasEvent.setPointtime(222222);
                gasEvent.setPressure(33333);
                gasEvent.setRunning(44444);
                gasEvent.setStandard(55555);
                gasEvent.setSummary(66666);
                gasEvent.setTemperature(77777);
                hazelcastEvent.setGasEvent(gasEvent);
                wsClientPoolApi.sendMonitorData(hazelcastEvent);
                // End  : 发送 hazel 的测试数据

            } catch (Exception e) {
            }
        }
    }
}
