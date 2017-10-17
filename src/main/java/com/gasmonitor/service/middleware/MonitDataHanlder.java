package com.gasmonitor.service.middleware;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.User;
import com.gasmonitor.service.site.SiteService;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.service.warn.WarnEventService;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.List;

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
    private SiteService siteService;

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private WarnEventService warnEventService;

    //处理报警信息
    public void doGaoJjing(MonitorData data, Device device) {
        log.info("开始判断是否有告警信息data:{},device:{}", data.getGasEvent().getPressure(), device);
        StringBuffer sb = new StringBuffer();
        ///默认是正常情况
        data.setGaojing(false);
        //温度
        if (device.getTemperatureLow() != null && data.getGasEvent().getTemperature() > device.getTemperatureLow()) {
            data.setGaojing(true);
            sb.append("温度(" + data.getGasEvent().getTemperature() + ")太低，低于" + device.getTemperatureLow() + ";");
        }

        if (device.getTemperatureLow() != null && data.getGasEvent().getTemperature() > device.getTemperatureUpper()) {
            data.setGaojing(true);
            sb.append("温度(" + data.getGasEvent().getTemperature() + ")太高，超过" + device.getTemperatureUpper() + ";");
        }

        //压强
        if (device.getPressureLow() != null && data.getGasEvent().getPressure() < device.getPressureLow()) {
            data.setGaojing(true);
            sb.append("压强(" + data.getGasEvent().getPressure() + ")太低,低于" + device.getPressureLow() + ";");
        }

        if (device.getPressureUpper() != null && data.getGasEvent().getPressure() > device.getPressureUpper()) {
            data.setGaojing(true);
            sb.append("压强(" + data.getGasEvent().getPressure() + ")太高,高于" + device.getPressureUpper() + ";");
        }

        //工况
        if (device.getRunningFloor() != null && data.getGasEvent().getRunning() < device.getRunningFloor()) {
            data.setGaojing(true);
            sb.append("工况(" + data.getGasEvent().getRunning() + ")太低,低于" + device.getRunningFloor());
        }

        if (device.getRunningUpper() != null && data.getGasEvent().getRunning() < device.getRunningUpper()) {
            data.setGaojing(true);
            sb.append("工况(" + data.getGasEvent().getRunning() + ")太高,高于" + device.getRunningUpper());
        }
        //标况
        if (device.getStandardFloor() != null && data.getGasEvent().getStandard() < device.getStandardFloor()) {
            data.setGaojing(true);
            sb.append("标况(" + data.getGasEvent().getStandard() + ")太低,低于" + device.getStandardFloor());
        }
        if (device.getStandardUpper() != null && data.getGasEvent().getStandard() < device.getStandardUpper()) {
            data.setGaojing(true);
            sb.append("标况(" + data.getGasEvent().getStandard() + ")太高,高于" + device.getStandardUpper());
        }

        //累计
        if (device.getSummaryFloor() != null && data.getGasEvent().getSummary() < device.getSummaryFloor()) {
            data.setGaojing(true);
            sb.append("累计流量(" + data.getGasEvent().getSummary() + ")太低,低于" + device.getSummaryFloor());
        }
        if (device.getSummaryUpper() != null && data.getGasEvent().getPressure() < device.getSummaryUpper()) {
            data.setGaojing(true);
            sb.append("累计流量(" + data.getGasEvent().getSummary() + ")太高,高于" + device.getSummaryUpper());
        }

        //剩余
        if (device.getSurplusFloor() != null && data.getGasEvent().getSurplus() < device.getSurplusFloor()) {
            data.setGaojing(true);
            sb.append("剩余流量(" + data.getGasEvent().getSurplus() + ")太低,低于" + device.getPressureUpper());
        }

        if (device.getSurplusUpper() != null && data.getGasEvent().getSurplus() < device.getSurplusUpper()) {
            data.setGaojing(true);
            sb.append("剩余流量(" + data.getGasEvent().getSurplus() + ")太高,高于" + device.getSurplusUpper());
        }

        //模拟1
        if (device.getUanalog1Floor() != null && data.getGasEvent().getAnalog1() < device.getUanalog1Floor()) {
            data.setGaojing(true);
            sb.append("模拟1(" + data.getGasEvent().getAnalog1() + ")太低,低于" + device.getUanalog1Floor());
        }
        if (device.getUanalog1Upper() != null && data.getGasEvent().getAnalog1() < device.getUanalog1Upper()) {
            data.setGaojing(true);
            sb.append("模拟1(" + data.getGasEvent().getAnalog1() + ")太高,高于" + device.getUanalog1Upper());
        }

        //模拟2
        if (device.getUanalog2Floor() != null && data.getGasEvent().getAnalog2() < device.getUanalog2Floor()) {
            data.setGaojing(true);
            sb.append("模拟2(" + data.getGasEvent().getAnalog2() + ")太低,低于" + device.getUanalog2Floor());
        }
        if (device.getUanalog2Upper() != null && data.getGasEvent().getAnalog2() > device.getUanalog2Upper()) {
            data.setGaojing(true);
            sb.append("模拟2(" + data.getGasEvent().getAnalog2() + ")太高,高于" + device.getUanalog2Upper());
        }

        //模拟3
        if (device.getUanalog3Floor() != null && data.getGasEvent().getAnalog3() < device.getUanalog3Floor()) {
            data.setGaojing(true);
            sb.append("模拟3(" + data.getGasEvent().getAnalog3() + ")太低,低于" + device.getUanalog3Floor());
        }
        if (device.getUanalog3Upper() != null && data.getGasEvent().getAnalog3() > device.getUanalog3Upper()) {
            data.setGaojing(true);
            sb.append("模拟3(" + data.getGasEvent().getAnalog3() + ")太高,高于" + device.getUanalog3Upper());
        }

        //模拟4
        if (device.getUanalog4Floor() != null && data.getGasEvent().getAnalog4() < device.getUanalog4Floor()) {
            data.setGaojing(true);
            sb.append("模拟4(" + data.getGasEvent().getAnalog4() + ")太低,低于" + device.getUanalog4Floor());
        }
        if (device.getUanalog4Upper() != null && data.getGasEvent().getAnalog4() > device.getUanalog4Upper()) {
            data.setGaojing(true);
            sb.append("模拟4(" + data.getGasEvent().getAnalog4() + ")太高,高于" + device.getUanalog4Upper());
        }


        //电池
        if (device.getUbatteryFloor() != null && data.getGasEvent().getBattery() < device.getUbatteryFloor()) {
            data.setGaojing(true);
            sb.append("压强(" + data.getGasEvent().getBattery() + ")太低,低于" + device.getUbatteryFloor());
        }

        //ac220
        if (device.getUac220Floor() != null && data.getGasEvent().getAc220() < device.getUac220Floor()) {
            data.setGaojing(true);
            sb.append("压强(" + data.getGasEvent().getAc220() + ")太低,低于" + device.getUac220Floor());
        }

        //太阳能
        if (device.getUsolarFloor() != null && data.getGasEvent().getSolar() < device.getUsolarFloor()) {
            data.setGaojing(true);
            sb.append("太阳能(" + data.getGasEvent().getSolar() + ")太低,低于" + device.getUsolarFloor());
        }

        data.setMsg(sb.toString());
        log.info("判断告警的结果:{},{}", data.getGaojing(), data.getMsg());
        //如果这里告警了，需要增加一条告警信息
        if (data.getGaojing()) {
            warnEventService.addWarn(data, device);
        }
    }

    @Async
    public void handlerMonitor(MonitorData data) {
        Device d = deviceRepository.findByHardwareId(data.getGasEvent().getHardwareId());
        try {
            doGaoJjing(data, d);        //构造报警信息
        } catch (Exception e) {
            e.printStackTrace();
            ///默认是正常情况
            data.setGaojing(false);
            data.setMsg("");
        }

        Long watch = d.getWatcher();
        if (watch == null) {
            log.info("data:{}对应设备的warch为null", data);
        }

        //这里应该是把所有的操作员都找到，然后发送出去
        List<User> users = userService.findUserByTenantId(siteService.findOne(d.getSiteId()).getTenantId());
        for (User u : users) {
            log.info("handlrMOnitor开始处理data:{},device:{}，发送给user:{}", data, d, u.getUsername());
            template.convertAndSendToUser(u.getUsername(), "/queue/notifications", data);
        }
    }
}
