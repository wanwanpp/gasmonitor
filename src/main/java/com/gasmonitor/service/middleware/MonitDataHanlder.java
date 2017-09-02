package com.gasmonitor.service.middleware;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.DeviceWarnEventRepository;
import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.DeviceWarnEvent;
import com.gasmonitor.entity.Site;
import com.gasmonitor.pros.Consts;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Date;

/**
 * Created by saplmm on 2017/7/29.
 * 专门处理监控数据
 */

@Service
public class MonitDataHanlder {
    private Logger log = LoggerFactory.getLogger(MonitDataHanlder.class);

    @Autowired
    public SimpMessagingTemplate template;

    @Autowired
    private UserService userService;

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private SiteRepository siteRepository;
    @Autowired
    private DeviceWarnEventRepository deviceWarnEventRepository;

    //处理报警信息
    public void doGaoJjing(MonitorData data, Device device) {
        StringBuffer sb = new StringBuffer();
        ///默认是正常情况
        data.setGaojing(false);
        if (data.getGasEvent().getTemperature() > device.getTemperatureUpper()) {
            data.setGaojing(true);
            sb.append("温度(" + data.getGasEvent().getTemperature() + ")太高，超过" + device.getTemperatureUpper() + ";");
        }

        if (data.getGasEvent().getTemperature() < device.getTemperatureUpper()) {
            data.setGaojing(true);
            sb.append("温度太低,低于" + device.getTemperatureUpper() + ";");
        }

        if (data.getGasEvent().getPressure() > device.getPressureUpper()) {
            data.setGaojing(true);
            sb.append("压强太高,高于" + device.getPressureUpper() + ";");
        }

        if (data.getGasEvent().getPressure() < device.getPressureUpper()) {
            data.setGaojing(true);
            sb.append("压强太低,低于" + device.getPressureUpper());
        }
        data.setMsg(sb.toString());

        //如果这里告警了，需要增加一条告警信息
        if (data.getGaojing()) {
            DeviceWarnEvent event = new DeviceWarnEvent();
            event.setCreateTime(new Date());
            event.setStatus(Consts.WARNDEVICE_STATUS.INIT);
//            event.setWarnValue();
            event.setDeviceId(device.getId());
            Site site = siteRepository.findById(device.getSiteId());
            if (site != null) {
                event.setTenantId(site.getTenantId());//如果站点不为空，那么通过站点找到tenantId
            }
            deviceWarnEventRepository.save(event);
        }
    }

    @Async
    public void handlerMonitor(MonitorData data) {
        Device d = deviceRepository.findByHardwareId(data.getGasEvent().getHardwareId());
        try {
            doGaoJjing(data, d);        //构造报警信息
        } catch (Exception e) {
            ///默认是正常情况
            data.setGaojing(false);
            data.setMsg("");
        }

        Long watch = d.getWatcher();
        if (watch == null) {
            log.info("data:{}对应设备的warch为null", data);
        }
        String userName = userService.findOne(watch).getUsername();
        log.info("handlrMOnitor开始处理data:{},device:{}，发送给user:{}", data, d, userName);
        
        template.convertAndSendToUser(userName, "/queue/notifications", data);
    }
}
