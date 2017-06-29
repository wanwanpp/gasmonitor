package com.gasmonitor.controller.site;

import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Site;
import com.gasmonitor.vo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by saplmm on 2017/6/26.
 * 站点 相关的控制器
 */

@Controller
@RequestMapping(value = "/site")
public class SiteController {

    @Autowired
    private SiteRepository siteRepository;


    @RequestMapping(value = "list")
    public String siteList() {
        return "site/list";
    }


    //    通过租户信息和站点名字 查询站点
    @RequestMapping(value = "/ajax/list")
    @ResponseBody
    public AjaxResult<Site> listStie(String siteName) {
        AjaxResult<Site> data = new AjaxResult<>(siteRepository.findAll());
        return data;
    }


    @RequestMapping(value = "/ajax/update", method = RequestMethod.POST)
    @ResponseBody
    public Site update(Long id, String name, Double longitude, Double latitude) {
        Site site = siteRepository.findOne(id);
        if (site == null) {
            return null;
        }

        if (name != null && !name.equals("")) {
            site.setName(name);
        }
        if (longitude != null && longitude != 0) {
            site.setLongitude(longitude);
        }

        if (latitude != null && latitude != 0) {
            site.setLatitude(latitude);
        }
        return siteRepository.save(site);
    }


    //    通过Id查询一个站点的信息
    @RequestMapping(value = "/ajax/get")
    @ResponseBody
    public AjaxResult<Site> get(Long id) {
        if (id == null) {
            return null;
        } else {
            Site site = siteRepository.getOne(id);
            return new AjaxResult<Site>(site);
        }
    }
}
