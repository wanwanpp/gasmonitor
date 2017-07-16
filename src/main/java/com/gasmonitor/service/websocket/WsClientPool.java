package com.gasmonitor.service.websocket;

import com.gasmonitor.entity.GasHazelcast;
import com.gasmonitor.protobuf.GasMsg;
import com.gasmonitor.service.middleware.api.WsClientPoolApi;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.util.*;

/**
 * Created by saplmm on 2017/6/13.
 * websocket 连接池
 */

@Service
public class WsClientPool implements WsClientPoolApi {
    private Logger log = LoggerFactory.getLogger(WsClientPool.class);


    private static final Map<String, Set<String>> clients = new HashMap<String, Set<String>>();

    @Autowired
    public SimpMessagingTemplate template;

    @Override
    public void addClient() {

    }

    @Override
    public void rmClient() {

    }

    @Override
    public void addMonitorStations(String client, String station) {
        Set<String> statios = clients.get(client);
        if (statios == null) {
            statios = new HashSet<String>();
            statios.add(station);
            clients.put(client, statios);
        }

        //打印所有的信息
        log.info("所有的站点信息:{}", clients);
    }

    @Override
    public void rmMonitorStations() {

    }

    @Override
    public boolean sendMonitorData(MonitorData data) {
        log.info("sendMonitorData：{}", data);
        for (Iterator<String> iterator = clients.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            Set<String> stations = clients.get(key);
            log.info("[WsClientPool.sendMonitorData]data.getGasEvent().getHardwareId(): {}", data.getGasEvent().getHardwareId());
            log.info("[WsClientPool.sendMonitorData]stations.contains(data.getGasEvent().getHardwareId()): {}", stations.contains(data.getGasEvent().getHardwareId()));
//            if (stations.contains(data.getGasEvent().getHardwareId())) {
            template.convertAndSendToUser(key, "/queue/notifications", data);
            log.info("给用户{}发送data{}...", key, data);
//            }
        }
        return true;
    }

    @Override
    public boolean sendMonitorData(GasHazelcast data) {
        log.info("sendMonitorData-->GasHazelcast：{},tenantId:{}", data.toString(), data.getTenantId());
        MonitorData monitorData = new MonitorData();
        monitorData.setGasEvent(data.getGasEvent());
        // this.sendMonitorData(new MonitorData());
        this.sendMonitorData(monitorData);
        return false;
    }

    //目前使用的是这个函数，直接发送json数据给浏览器
    @Override
    public boolean sendMonitorData(String msg) {
        log.info("开始处理接收到的数据{}", msg);
        for (Iterator<String> iterator = clients.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            template.convertAndSendToUser(key, "/queue/notifications", msg);
        }
        return true;
    }

    @Override
    public void sendMonitorData(GasMsg.GasData gasData) {
        log.info("开始处理接收到的数据{}", gasData);
        for (Iterator<String> iterator = clients.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            Set<String> stations = clients.get(key);
            template.convertAndSendToUser(key, "/queue/notifications", gasData);
            if (stations.contains(gasData.getHardware())) {
                template.convertAndSendToUser(key, "/queue/notifications", gasData);
                log.info("给用户{}发送mqtt  data{}...", key, gasData.toString());
            }
        }
    }

    public static Map<String, Set<String>> getClients() {
        return clients;
    }

}
