package com.gasmonitor.controller.test;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.pros.Consts;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.service.bas.BasDataUnitService;
import com.gasmonitor.service.warn.WarnEventService;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.CacheManager;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.PostConstruct;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.Date;
import java.util.Enumeration;
import java.util.List;

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

    @Autowired
    private HazelCastPros hazelCastPros;

    @Autowired
    private BasDataUnitService basDataUnitService;

    @Autowired
    private CacheManager cacheManager;

    private IMap<String, String> map;

    @PostConstruct
    public void init() {
        logger.info("初始化TestController 的时候调用....");
        map = hazelcastInstance.getMap("tenant");

    }


    @RequestMapping(value = "device/dao")
    public Object deviceDao() {
        List<Device> devices = deviceRepository.findByTenantId((long) 1);
        return devices;
    }


    @RequestMapping(value = "/device/save")
    public Object saveDevice(Long id) {
        Device device = deviceRepository.findOne(id);
        logger.info("test/device/save/{}" + device);
        return deviceRepository.save(device);
    }

    @RequestMapping("device/getDeviceById")
    public Object getDeviceById(Long id) {
        return deviceRepository.findOne(id);
    }

    @RequestMapping("device/findByHardwareId")
    public Object findByHardwareId(String id) {
        return deviceRepository.findByHardwareId(id);
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
        return map;
    }

//    @RequestMapping(value = "hz/showmapuser")
//    public Object showHazelcastmapuser() {
//        return hazelcastInstance.getMap(hazelCastPros.getMapuserall());
//    }

    @RequestMapping(value = "hz/showmapdevice")
    public Object showHazelcastmapdevice() {
        return hazelcastInstance.getMap(hazelCastPros.getMapdeviceall());
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
//        return WsClientPool.getClients();
        return null;
    }

    @RequestMapping("datef")
    @ResponseBody
    public Object fetchResult(@DateTimeFormat(pattern = "yyyy-MM-dd:HH:mm:ss") Date date) {
        logger.info("获取到的时间信息:{}", date);
        return date;
    }

    @RequestMapping("/basdata/unit/findall")
    @ResponseBody
    public Object unitFindall() {
        return basDataUnitService.findAll();
    }

    @RequestMapping("/basdata/unit/findone/{id}")
    @ResponseBody
    public Object unitFindone(@PathVariable("id") Long id) {
        return basDataUnitService.findOne(id);
    }


    @RequestMapping("/cache/all")
    @ResponseBody
    public Object cacheAll() {
        return cacheManager.getCache(Consts.CACHE_DEVICE).toString();
    }


    @Autowired
    WarnEventService warnEventService;

    @RequestMapping("testsession")
    public Object testSession() {
        return warnEventService.findByTenantId(0, 1);
    }
}

