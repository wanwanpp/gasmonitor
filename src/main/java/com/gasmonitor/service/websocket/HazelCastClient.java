/**
 * Copyright 2013 Marin Solutions
 */
package com.gasmonitor.service.websocket;

import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.vo.MonitorData;
import com.hazelcast.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;

/**
 * @author Roger
 */
@Service
public class HazelCastClient implements CommandLineRunner {
    private final static Logger logger = LoggerFactory.getLogger(HazelCastClient.class);

    @Autowired
    private HazelCastPros hazelCastPros;

    @Autowired
    private WsClientPool wsClientPool;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("启动hazelcast的客户端...并且开始接受消息...，hazelcast.name:{}", hazelCastPros.getName());
        HazelcastInstance hzInstance = Hazelcast.newHazelcastInstance();
        ITopic<MonitorData> topic = hzInstance.getTopic(hazelCastPros.getName());
        topic.addMessageListener((message) -> wsClientPool.sendMonitorData(message.getMessageObject()));
    }
}