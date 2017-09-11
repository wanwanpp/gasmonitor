package com.gasmonitor.service.warn;

import com.gasmonitor.dao.DeviceWarnEventRepository;
import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.DeviceWarnEvent;
import com.gasmonitor.entity.Site;
import com.gasmonitor.entity.User;
import com.gasmonitor.pros.Consts;
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
 * Created by saplmm on 2017/8/28.
 */

@Service
public class WarnEventService {
    Logger log = LoggerFactory.getLogger(WarnEventService.class);

    @Autowired
    private DeviceWarnEventRepository deviceWarnEventRepository;

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


    @Transactional
    public void updateWarn(Long id, Integer type, String msg) {
        int result = deviceWarnEventRepository.updateStatus(type, id, msg);

    }

    //增加一个告警信息
    @Async
    public void addWarn(MonitorData data, Device device) {
        log.info("有报警信息:monitorData:{}", data);
        DeviceWarnEvent event = new DeviceWarnEvent();
        event.setCreateTime(new Date());
        event.setStatus(Consts.WARNDEVICE_STATUS.INIT);
//        event.setWarnValue();
        event.setDes(data.getMsg());
        event.setDeviceId(device.getId());
        Site site = siteService.findOne(device.getSiteId());
        if (site != null) {
            event.setTenantId(site.getTenantId());//如果站点不为空，那么通过站点找到tenantId
        }
        deviceWarnEventRepository.save(event);
    }

}
