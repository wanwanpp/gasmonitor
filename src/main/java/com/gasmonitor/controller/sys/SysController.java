package com.gasmonitor.controller.sys;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.vo.SysInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by saplmm on 2017/6/23.
 */
@Controller
@RequestMapping(value = "sys")
public class SysController {

    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private DeviceRepository deviceRepository;


    @RequestMapping(value = "setting")
    public String setting(ModelMap modelMap) {
        SysInfoVo vo = new SysInfoVo();
        vo.setDeviceCount(deviceRepository.count());
        vo.setTenantCount(tenantRepository.count());
        vo.setMsg("暂无警告");
        modelMap.addAttribute("vo", vo);
        return "sys/setting";
    }
}
