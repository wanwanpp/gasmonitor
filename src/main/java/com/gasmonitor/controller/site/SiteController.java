package com.gasmonitor.controller.site;

import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.entity.Site;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.entity.User;
import com.gasmonitor.service.site.SiteService;
import com.gasmonitor.utils.PageUtils;
import com.gasmonitor.utils.SessionUtils;
import com.gasmonitor.vo.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.security.Principal;
import java.util.List;

/**
 * Created by saplmm on 2017/6/26.
 * 站点 相关的控制器
 */

@Controller
@RequestMapping(value = "/site")
public class SiteController {
    private Logger logger = LoggerFactory.getLogger(SiteController.class);

    @Autowired
    private SiteRepository siteRepository;

    @Autowired
    private SiteService siteService;


    @RequestMapping(value = "list")
    public String siteList() {
        return "site/list";
    }

    @RequestMapping(value = "/sites-manage")
    public String sitesManage() {
        return "site/sites-manage";
    }


    //    通过租户信息和站点名字 查询站点
    @RequestMapping(value = "/ajax/list")
    @ResponseBody
    public AjaxResult<Site> listStie(@RequestParam(defaultValue = "") String searchKey, Integer currPage, HttpSession session, Principal principal) {
        logger.info("开始查询站点列表:principal.getName() --> {}", principal.getName());
        AjaxResult<Site> data;
        User user = SessionUtils.getUser(session);
        if (user != null) {
            data = AjaxResult.NewAjaxResult(siteRepository.findByTenantIdAndNameContaining(user.getTenantId(), searchKey, PageUtils.p(currPage)));
        } else {
            data = AjaxResult.SuccAjaxResult();
        }
        return data;
    }

    @RequestMapping(value = "/ajax/new", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult ajaxNew(Site site, HttpSession session) {
        User user = SessionUtils.getUser(session);
        return siteService.newSite(site, user.getTenantId());
    }

    @RequestMapping(value = "/ajax/update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult update(Long id, String name, Double longitude, Double latitude, Integer deviceLimit) {
        logger.info("开始更新站点的信息id:{},name:{}", id, name);
        Site site = siteRepository.findOne(id);
        if (site == null) {
            return AjaxResult.ErrorAjaxResult();
        }

        if (!StringUtils.isEmpty(name)) {
            site.setName(name);
        }
        if (longitude != null && longitude != 0) {
            site.setLongitude(longitude);
        }

        if (latitude != null && latitude != 0) {
            site.setLatitude(latitude);
        }

        if (deviceLimit != null) {
            site.setDeviceLimit(deviceLimit);
        }

        //保存站点信息
        siteRepository.save(site);
        return AjaxResult.SuccAjaxResult();
    }

    @RequestMapping(value = "/ajax/remove", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult remove(Long id) {
        siteRepository.delete(id);
        return AjaxResult.SuccAjaxResult();
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

    @RequestMapping(value = "/ajax/allSiteAndDevie")
    @ResponseBody
    public AjaxResult<Site> allsiteAndDevie(HttpSession session) {
        User user = SessionUtils.getUser(session);
        AjaxResult<Site> sites = siteService.allsiteAndDevie(user.getTenantId());
        return sites;
    }
}
