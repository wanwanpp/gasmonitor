/**
 * Copyright 2013 Marin Solutions
 */
package com.gasmonitor.service.middleware;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.GasHazelcast;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.service.middleware.api.WsClientPoolApi;
import com.hazelcast.core.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Roger
 */
@Component
public class HazelCastClient implements CommandLineRunner {
    private final static Logger logger = LoggerFactory.getLogger(HazelCastClient.class);

    @Autowired
    private HazelCastPros hazelCastPros;

    @Autowired
    private WsClientPoolApi wsClientPool;

    @Autowired
    private HazelcastInstance hazelcastInstance;

    @Autowired
    private TenantRepository tenantRepository;
    @Autowired
    private DeviceRepository deviceRepository;

    @Override
    public void run(String... strings) throws Exception {
        logger.info("启动hazelcast的客户端...并且开始接受消息...，hazelcast.name:{},topic.name:{}",
                hazelCastPros.getName(), hazelCastPros.getNametopic());

        //
        this.initTenantMap();
        this.initMsgListener();
    }

    //启动之后，初始化 map
    /*
        1,需要把所有的玩家和设备表对应起来
        2,如果租户的数据过大，需要分页处理
        3,如果租户和设备之间的关系所有边，也需要动态的做处理
     */
    public void initTenantMap() {
        //得到map
        IMap<String, String> map = hazelcastInstance.getMap(hazelCastPros.getMaptenant());
        //开始初始化
        List<Tenant> tenants = tenantRepository.findAll();
        for (Tenant user : tenants) {
            logger.info("处理map-->tenant-->{},{}", user.getId(), user.getName());
            List<Device> devices = deviceRepository.findByTenantId(user.getId());
            for (Device d : devices) {
                logger.info("处理map-->tenant-->device {}", d.getHardwareId());
                if (d.getHardwareId() != null) {    //逻辑设备不需要放进去
                    map.set(d.getHardwareId(), user.getId() + "");
                }
            }
        }
    }

    //初始化listener
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