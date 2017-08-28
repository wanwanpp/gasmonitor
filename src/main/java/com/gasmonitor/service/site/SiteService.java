package com.gasmonitor.service.site;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.Site;
import com.gasmonitor.vo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/7/25.
 */

@Service
public class SiteService {

    @Autowired
    private SiteRepository siteRepository;

    @Autowired
    private DeviceRepository deviceRepository;

    //返回所有的站点设备消息
    @Transactional
    public AjaxResult<Site> allsiteAndDevie(Long tenantId) {
        //1,找到所有的站点
        List<Site> sites = siteRepository.findByTenantId(tenantId);
        for (Site s : sites) {
            s.setDevices(deviceRepository.findBySiteIdAndParent(s.getId(), (long) 0));
            for (Device d : s.getDevices()) {
                d.setChildren(deviceRepository.findBySiteIdAndParent(s.getId(), d.getId()));
            }
        }
        //返回最终的结果
        return AjaxResult.NewAjaxResult(sites);
    }


    //返回所有的站点设备消息
    @Transactional
    public AjaxResult<Site> allSitesAndDevices(Long tenantId) {
        //1,找到所有的站点
        List<Site> sites = siteRepository.findByTenantId(tenantId);
        for (Site s : sites) {
            s.setDevices(deviceRepository.findBySiteIdAndParent(s.getId(), (long) 0));
            for (Device d : s.getDevices()) {
                d.setChildren(deviceRepository.findBySiteIdAndParent(s.getId(), d.getId()));
            }
        }
        //返回最终的结果
        return AjaxResult.NewAjaxResult(sites);
    }


    //新建一个站点
    public AjaxResult<Site> newSite(Site site, Long tenantId) {
        site.setTenantId(tenantId);
        site.setCreatedate(new Date());
        site = siteRepository.save(site);   //保存一个站点
        return new AjaxResult<Site>(site);
    }
}
