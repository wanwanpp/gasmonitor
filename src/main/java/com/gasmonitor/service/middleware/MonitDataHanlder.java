package com.gasmonitor.service.middleware;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

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

    //处理报警信息
    public void doGaoJjing(MonitorData data, Device device) {
        if (data.getGasEvent().getTemperature() > device.getTemperatureUpper()) {
            data.setGaojing(true);
            data.setMsg("温度太高");
            return;
        }

        if (data.getGasEvent().getTemperature() < device.getTemperatureUpper()) {
            data.setGaojing(true);
            data.setMsg("温度太低");
            return;
        }

        if (data.getGasEvent().getPressure() > device.getPressureUpper()) {
            data.setGaojing(true);
            data.setMsg("压强太高");
            return;
        }

        if (data.getGasEvent().getPressure() < device.getPressureUpper()) {
            data.setGaojing(true);
            data.setMsg("压强太低");
            return;
        }

        ///默认是正常情况
        data.setGaojing(false);
        data.setMsg("");
    }

    @Async
    public void handlerMonitor(MonitorData data) {
        Device d = deviceRepository.findByHardwareId(data.getGasEvent().getHardwareId());
        String userName = userService.findOne(d.getWatcher()).getUsername();
        log.info("handlrMOnitor开始处理data:{},device:{}，发送给user:{}", data, d, userName);
        try {
            doGaoJjing(data, d);        //构造报警信息
        } catch (Exception e) {
            ///默认是正常情况
            data.setGaojing(false);
            data.setMsg("");
        }
        template.convertAndSendToUser(userName, "/queue/notifications", data);
    }
}
