package com.gasmonitor.controller.tenant;import com.gasmonitor.dao.TenantRepository;import com.gasmonitor.entity.Tenant;import com.gasmonitor.vo.AjaxResult;import org.slf4j.Logger;import org.slf4j.LoggerFactory;import org.springframework.beans.factory.annotation.Autowired;import org.springframework.data.domain.Page;import org.springframework.data.domain.PageRequest;import org.springframework.stereotype.Controller;import org.springframework.web.bind.annotation.RequestMapping;import org.springframework.web.bind.annotation.ResponseBody;/** * Created by saplmm on 2017/6/12. */@Controller@RequestMapping(value = "/tenant")public class TenantController {    private Logger logger = LoggerFactory.getLogger(TenantController.class);    @Autowired    private TenantRepository tenantRepository;    @RequestMapping(value = "/info")    public String info() {        return "/tenant/info";    }    //编辑租户的信息    @RequestMapping(value = "/edit")    public String edit() {        return "/tenant/edit";    }    //查询租户的列表    @RequestMapping(value = "/list")    public String list() {        return "/tenant/list";    }    @ResponseBody    @RequestMapping(value = "/ajax/list")    public AjaxResult<Tenant> ajaxList() {        Page<Tenant> page = tenantRepository.findAll(new PageRequest(0, 2));        AjaxResult<Tenant> result = AjaxResult.NewAjaxResult(page.getContent(), page.getNumber(), page.getSize());        logger.info("找到的所有租户{}", result);        return result;    }    // Start: 20170625 这里好像是对租户的增删改查？租户的菜单跳转暂时也先放这里吧    @RequestMapping(value = "/site-manage")    public String siteManage() {        return "/tenant/site-manage";    }    // End  : 20170625 这里好像是对租户的增删改查？租户的菜单跳转暂时也先放这里吧}