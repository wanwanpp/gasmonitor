/**
 * Copyright 2013 Marin Solutions
 */
package com.gasmonitor.service.middleware;

import com.gasmonitor.entity.GasHazelcast;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.service.device.api.DeviceService;
import com.gasmonitor.service.tenant.TenantService;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.service.websocket.WsClientPool;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.ITopic;
import com.hazelcast.core.Message;
import com.hazelcast.core.MessageListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Roger
 */
@Component
public class HazelCastClient implements CommandLineRunner {
    private final static Logger logger = LoggerFactory.getLogger(HazelCastClient.class);

    @Autowired
    private HazelCastPros hazelCastPros;

    @Autowired
    private WsClientPool wsClientPool;

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @Autowired
    private TenantService tenantService;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private UserService userService;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("启动hazelcast的客户端...并且开始接受消息...，hazelcast.name:{},topic.name:{}",
                hazelCastPros.getName(), hazelCastPros.getNametopic());

        tenantService.initTenantMap();   //初始化tenant-->device 的映射
        deviceService.loadAllDeviceMap();//load所有的设备
        userService.loadAllUserMap();//load 所有的User
        this.initMsgListener();//初始化消息监听器
    }
    
    //初始化listener：这里做接收到消息之后的处理
    public void initMsgListener() {
        ITopic<GasHazelcast> topic = hazelcastInstance.getTopic(hazelCastPros.getNametopic());
        topic.addMessageListener(new MessageListener<GasHazelcast>() {
            @Override
            public void onMessage(Message<GasHazelcast> message) {
                GasHazelcast hazelcastEvent = (GasHazelcast) message.getMessageObject();
                logger.info("接收到的数据信息:{}", hazelcastEvent);
                wsClientPool.sendMonitorData(hazelcastEvent);
            }
        });
    }
}