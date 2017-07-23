package com.gasmonitor.controller.device;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.Site;
import com.gasmonitor.service.device.api.DeviceService;
import com.gasmonitor.utils.SessionUtils;
import com.gasmonitor.vo.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 * 设备相关的控制器
 */

@Controller
@RequestMapping(value = "/device")
public class DeviceController {

    private final Logger log = LoggerFactory.getLogger(DeviceController.class);

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private DeviceService deviceService;
    @Autowired
    private SiteRepository siteRepository;

    //设备管理列表 界面
    @RequestMapping(value = "/list")
    public String deviceList(ModelMap modelMap) {
        List<Site> sites = siteRepository.findAll();
        log.info("寻找到所有的站点信息:{}", sites);
        modelMap.addAttribute("sites", sites);
        return "device/list";
    }

    //ajax 获取设备信息的列表
    @RequestMapping(value = "/ajax/list")
    @ResponseBody
    public AjaxResult<Device> ajaxList(@RequestParam(value = "siteId", defaultValue = "0") Long siteId,
                                       @RequestParam(value = "searchKey", defaultValue = "") String searchKey,
                                       Integer currPage) {
        List<Device> devices = deviceRepository.findBySiteId(siteId);
        log.info("通过站点{}查询到的所有设备的信息{}", siteId, devices);
        return new AjaxResult<Device>(devices);
    }

    //ajax 增加一个设备
    @RequestMapping(value = "/ajax/new", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult<Device> ajaxAddDevice(Device device, HttpSession session) {
        //新生成的设备
        device = deviceService.addDevice(device, SessionUtils.getTanat(session).getId());
        return new AjaxResult<>(device);
    }


    //ajax 删除一个设备
    @RequestMapping(value = "/ajax/rm")
    @ResponseBody
    public AjaxResult<Device> ajaxRmDevice(Long id) {
        deviceRepository.delete(id);
        return AjaxResult.SuccAjaxResult();
    }

    //ajax 修改一个设备
    @RequestMapping(value = "/ajax/update")
    @ResponseBody
    public AjaxResult<Device> ajaxUpdateDevice(Long id, String name, Integer logic, Long siteId, String phone, Integer status, Long parent) {
        //新生成的设备
        AjaxResult ret;
        Device device = deviceRepository.findOne(id);

        //如果在数据库中没有找到对应的设备，表示修改失败
        if (device == null) {
            ret = AjaxResult.ErrorAjaxResult();
            ret.setMsg("没有找到对应的设备，修改失败");
            return ret;
        }

        //找到对应的设备之后，修改并保存
        device.setCreated(new Date());
        device.setTokenId("");
        device.setName(name);
        device.setLogic(logic);
        device.setSiteId(siteId);
        device.setPhone(phone);
        device.setStatus(status);
        device.setParent(phone);
        log.info("创建新的设备:{}", device);

        Device retDevie = deviceRepository.save(device);
        return new AjaxResult<>(retDevie);
    }

    @RequestMapping(value = "/devices-manage")
    public String devicesManage() {
        return "device/devices-manage";
    }


}
