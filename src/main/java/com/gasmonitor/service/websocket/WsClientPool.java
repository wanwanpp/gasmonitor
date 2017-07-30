package com.gasmonitor.service.websocket;

import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.GasHazelcast;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.service.middleware.MonitDataHanlder;
import com.gasmonitor.vo.MonitorData;
import com.hazelcast.core.IMap;
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
public class WsClientPool {
    private Logger log = LoggerFactory.getLogger(WsClientPool.class);


    private static final Map<String, Set<String>> clients = new HashMap<String, Set<String>>();
    private static IMap<Long, Device> deviceIMap;

    @Autowired
    public SimpMessagingTemplate template;


    @Autowired
    private MonitDataHanlder monitDataHanlder;

    @Autowired
    private HazelCastPros hazelCastPros;

    public void addMonitorStations(String client, String station) {
        Set<String> statios = clients.get(client);
        if (statios == null) {
            statios = new HashSet<String>();
            clients.put(client, statios);
        }
        statios.add(station);
        //打印所有的信息
        log.info("所有的站点信息:{}", clients);
    }

    public void rmMonitorStations() {

    }

    public boolean sendMonitorData(MonitorData data) {
        log.info("sendMonitorData：{}", data);
        monitDataHanlder.handlerMonitor(data);
//        for (Iterator<String> iterator = clients.keySet().iterator(); iterator.hasNext(); ) {
//            String key = iterator.next();
//            Set<String> stations = clients.get(key);
//            log.info("[WsClientPool.sendMonitorData]data.getGasEvent().getHardwareId(): {}", data.getGasEvent().getHardwareId());
//            log.info("[WsClientPool.sendMonitorData]stations.contains(data.getGasEvent().getHardwareId()): {}", stations.contains(data.getGasEvent().getHardwareId()));
//            if (stations.contains(data.getGasEvent().getHardwareId())) {
//                template.convertAndSendToUser(key, "/queue/notifications", data);
//                log.info("给用户{}发送data{}...", key, data);
//            }
//        }
        return true;
    }

    public boolean sendMonitorData(GasHazelcast data) {
        log.info("sendMonitorData-->GasHazelcast：{},tenantId:{}", data.toString(), data.getTenantId());
        MonitorData monitorData = new MonitorData();
        monitorData.setGasEvent(data.getGasEvent());
        // this.sendMonitorData(new MonitorData());
        this.sendMonitorData(monitorData);
        return false;
    }

    //测试数据在用：目前使用的是这个函数，直接发送json数据给浏览器
    public boolean sendMonitorData(String msg) {
        log.info("开始处理接收到的数据{}", msg);
        for (Iterator<String> iterator = clients.keySet().iterator(); iterator.hasNext(); ) {
            String key = iterator.next();
            template.convertAndSendToUser(key, "/queue/notifications", msg);
        }
        return true;
    }

}
