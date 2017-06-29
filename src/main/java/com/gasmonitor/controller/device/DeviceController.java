package com.gasmonitor.controller.device;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.vo.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 * 设备相关的控制器
 */

@Controller
@RequestMapping(value = "/device")
public class DeviceController {

    private final Logger logger = LoggerFactory.getLogger(DeviceController.class);

    @Autowired
    private DeviceRepository deviceRepository;

    @RequestMapping(value = "/list")
    public String deviceList() {
        return "/device/list";
    }


    @RequestMapping(value = "/ajax/list")
    @ResponseBody
    public AjaxResult<Device> ajaxList(Long siteId) {
        List<Device> devices = deviceRepository.findBySiteId(siteId);
        logger.debug("通过站点{}查询到的所有设备的信息{}", siteId, devices);
        return new AjaxResult<Device>(devices);
    }
}
