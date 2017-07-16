package com.gasmonitor.controller.test;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.Site;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.service.websocket.WsClientPool;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;
import java.util.Set;

/**
 * Created by saplmm on 2017/6/26.
 */

@Controller
@RequestMapping(value = "/test")
@ResponseBody
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private DeviceRepository deviceRepository;

    @Autowired
    private TenantRepository tenantRepository;
    @Autowired
    private HazelcastInstance hazelcastInstance;

    @RequestMapping(value = "/device/list")
    public Object findDevice() {
        List<Device> devices = deviceRepository.findBySiteId((long) 999);
        logger.info("测试，找到的devices:{}", devices);
        return devices;
    }


    @RequestMapping(value = "device/dao")
    public Object deviceDao() {
        List<Device> devices = deviceRepository.findByTenantId((long) 1);
        return devices;
    }


    @RequestMapping(value = "/device/save")
    public Object saveDevice() {
        Device device = new Device();
        device.setSiteId((long) 999);
        device.setLogic(1);
        device.setName("name");
        device.setCreated(new Date());
        device.setParent("name");
        device.setWatcher("watcher");
        device.setPhone("18081922618");
        device.setTokenId("tokendId");
        device.setStatus(1);
        return deviceRepository.save(device);
    }

    @RequestMapping(value = "/device/get/{id}")
    public Object getDevice(@PathVariable(value = "id") long id) {
        Device device = deviceRepository.findOne(id);
        logger.info("查询到id{}的device{}", id, device);
        if (device != null) {
            Set<Site> sites = device.getSiteSet();
            logger.info("查询到id{}的device{}的sites{}", id, device, sites);
        }
        return device;
    }

    //暂时设置为get方便测试
    @RequestMapping(value = "/tenant/update")
    @Transactional
    public Object updateTenant(Tenant tenant) {
        tenantRepository.save(tenant);
        return null;
    }

    @RequestMapping(value = "/configs")
    public Object config() {
        return null;
    }


    @RequestMapping(value = "hz/showmap")
    public Object showHazelcastmap() {
        return hazelcastInstance.getMap("tenant");
    }

    @RequestMapping(value = "hz/clearwmap")
    public Object clearwmapHazelcastmap() {
        IMap<String, String> map = hazelcastInstance.getMap("tenant");
        map.clear();
        return map;
    }

    @RequestMapping(value = "session")
    public Object testSession(HttpSession session, Principal principal) {
        logger.info("session:{}", session);
        logger.info("session:{}", session.getId());
        Enumeration<String> names = session.getAttributeNames();
        while (names.hasMoreElements()) {
            String key = names.nextElement();
            logger.info("key:{}---->value:{}", key, session.getAttribute(key));
        }
        logger.info("principal.getName():{}", principal.getName());
        return session.getId();
    }

    @RequestMapping(value = "ws/wsClient")
    public Object wsClient() {
        return WsClientPool.getClients();
    }
}
