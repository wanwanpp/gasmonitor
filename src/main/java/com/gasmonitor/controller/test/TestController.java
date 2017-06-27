package com.gasmonitor.controller.test;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.entity.Device;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 */

@Controller
@RequestMapping(value = "/test")
public class TestController {

    private Logger logger = LoggerFactory.getLogger(TestController.class);
    @Autowired
    private DeviceRepository deviceRepository;

    @ResponseBody
    @RequestMapping(value = "/device/list")
    public Object findDevice() {
        List<Device> devices = deviceRepository.findBySiteId((long) 999);
        logger.info("测试，找到的devices:{}", devices);
        return devices;
    }

    @RequestMapping(value = "/device/save")
    @ResponseBody
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
}
