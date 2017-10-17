package com.gasmonitor.service.warn;

import com.gasmonitor.dao.DeviceWarnEventRepository;
import com.gasmonitor.entity.DeviceWarnEvent;
import com.gasmonitor.entity.Site;
import com.gasmonitor.entity.User;
import com.gasmonitor.pros.Consts;
import com.gasmonitor.service.device.DeviceService;
import com.gasmonitor.service.site.SiteService;
import com.gasmonitor.utils.SessionUtils;
import com.gasmonitor.vo.MonitorData;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

/**
 * @author saplmm
 * @date 2017/8/28
 */

@Service
public class WarnEventService {
    Logger log = LoggerFactory.getLogger(WarnEventService.class);

    @Autowired
    private DeviceWarnEventRepository deviceWarnEventRepository;

    @Autowired
    private DeviceService deviceService;

    @Autowired
    private SiteService siteService;

    @Autowired
    private HttpSession session;

    public List<DeviceWarnEvent> findByTenantId(Integer status) {
        User user = SessionUtils.getUser(session);
        return deviceWarnEventRepository.findByTenantIdAndStatus(user.getTenantId(), status);
    }

    public DeviceWarnEvent findOne(Long id) {
        return deviceWarnEventRepository.findOne(id);
    }

    /**
     * 通过设备Id查询告警时间
     *
     * @return
     */
    public List<DeviceWarnEvent> findByDeviceId(Long deviceId, Integer status) {
        return deviceWarnEventRepository.findByDeviceIdAndStatus(deviceId, status);
    }


    @Transactional(rollbackFor = Exception.class)
    public void updateWarn(Long id, Integer type, String msg) {
        try {
            deviceWarnEventRepository.updateStatus(type, id, msg);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //增加一个告警信息
    @Async
    public void addWarn(MonitorData data, com.gasmonitor.entity.Device device) {
        log.info("有报警信息:monitorData:{}", data);
        //如果设备的状态已经处于非正常状态，那么就不需要存储报警的数据了
        if (device.getStatus() == Consts.Device.STATUS_GAOJING) {
            return;
        }

        //初始化设备的状态
        deviceService.updateDeviceStatus(device.getId(), Consts.Device.STATUS_GAOJING); //处于告警的状态

        DeviceWarnEvent event = new DeviceWarnEvent();
        event.setCreateTime(new Date());
        event.setStatus(Consts.Event.STATUS_INIT);
        event.setDes(data.getMsg());
        event.setDeviceId(device.getId());
        Site site = siteService.findOne(device.getSiteId());
        if (site != null) {
            //如果站点不为空，那么通过站点找到tenantId
            event.setTenantId(site.getTenantId());
        }
        deviceWarnEventRepository.save(event);
    }

}
