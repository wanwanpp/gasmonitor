package com.gasmonitor.controller.tenant;

import com.gasmonitor.dao.SiteRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.dao.UserRepository;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.entity.User;
import com.gasmonitor.exception.TipsException;
import com.gasmonitor.pros.Role;
import com.gasmonitor.service.device.DeviceService;
import com.gasmonitor.service.tenant.TenantService;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.utils.PageUtils;
import com.gasmonitor.utils.SessionUtils;
import com.gasmonitor.vo.AjaxResult;
import com.gasmonitor.vo.TenantInfoVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;

import static com.gasmonitor.utils.PageUtils.p;

/**
 * Created by saplmm on 2017/6/12.
 */
@Controller
@RequestMapping(value = "/tenant")
public class TenantController {

    private Logger logger = LoggerFactory.getLogger(TenantController.class);
    @Autowired
    private TenantRepository tenantRepository;
    @Autowired
    private UserRepository userRepository;
    @Autowired
    private TenantService tenantService;
    @Autowired
    private UserService userSerevice;
    @Autowired
    private SiteRepository siteRepository;

    @Autowired
    private DeviceService deviceService;


    @RequestMapping(value = "/info")
    public String info(HttpServletRequest request, HttpSession session, ModelMap modelMap) {
        User user = SessionUtils.getUser(session);
        if (user == null) {
            try {
                request.logout();
            } catch (Exception e) {

            }
        } else {
            TenantInfoVo vo = new TenantInfoVo();
            vo.setSiteCount(siteRepository.countByTenantId(user.getTenantId()));
            vo.setDeviceCount(deviceService.countByTenantId(user.getTenantId()));
            vo.setMsg("暂无告警");
            modelMap.addAttribute("vo", vo);
        }
        return "tenant/info";
    }

    //编辑租户的信息
    @RequestMapping(value = "/edit")
    public String edit() {
        return "tenant/edit";
    }


    //增加租户
    @RequestMapping(value = "/ajax/new")
    @ResponseBody
    public AjaxResult<Tenant> ajaxNew(Tenant tenant) {
        Tenant ret = tenantService.newTenant(tenant);
        return new AjaxResult<>(ret);
    }

    @RequestMapping(value = "/ajax/remove")
    @ResponseBody
    public AjaxResult<Tenant> ajaxRemove(Long id) {
        if (id == null) {
            return AjaxResult.ErrorAjaxResult();
        }
        tenantRepository.delete(id);
        return AjaxResult.SuccAjaxResult();
    }

    @RequestMapping(value = "/ajax/update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult<Tenant> ajaxUpdate(Tenant newTenant) {
        return tenantService.updateTenant(newTenant);
    }


    //查询租户的列表
    @RequestMapping(value = "/list")
    public String list() {
        return "tenant/list";
    }

    @ResponseBody
    @RequestMapping(value = "/ajax/list")
    public AjaxResult<Tenant> ajaxList(int currPage, String searchKey) {
        // Page<Tenant> page = tenantRepository.findByNameContainingOrCompanyContaining(searchKey, searchKey, p(currPage));
        Page<Tenant> page = tenantRepository.findByNameContainingOrCompanyContainingOrderByCreatedateDesc(searchKey, searchKey, p(currPage));
        AjaxResult<Tenant> result = AjaxResult.NewAjaxResult(page);
        logger.info("找到的所有租户{}", result);
        return result;
    }

    // Start: 20170625 这里好像是对租户的增删改查？租户的菜单跳转暂时也先放这里吧


    @RequestMapping(value = "/statistics-statements")
    public String statisticsStatements() {
        return "tenant/statistics-statements";
    }

    @RequestMapping(value = "/settings")
    public String settings() {
        return "tenant/settings";
    }

    @RequestMapping(value = "/alarmEventManage")
    public String alarmEventManage() {
        return "tenant/alarmEventManage";
    }

    /**
     * 总表
     *
     * @return
     */
    @RequestMapping(value = "/sum-table")
    public String sumTable() {
        return "tenant/sum-table";
    }
    // End  : 20170625 这里好像是对租户的增删改查？租户的菜单跳转暂时也先放这里吧


    @RequestMapping(value = "/user/list")
    public String userList(ModelMap modelMap, HttpSession session) {
        User user = SessionUtils.getUser(session);
        List<Tenant> tenants = null;//所有的租户
        if (user.getRole().equalsIgnoreCase(Role.ROLE_TENANTADMIN)) {
            //如果是租户管理员:select 只显示自己租户所在的公司
            tenants = new ArrayList<>();
            Tenant t = tenantRepository.findOne(user.getTenantId());
            if (t != null) {
                tenants.add(t);
            }
        } else if (user.getRole().equalsIgnoreCase(Role.ROLE_SYSTEM)) {
            //如果是租户管理员:select 显示所有的租户
            tenants = tenantRepository.findAll();
        }
        //开始查询
        if (tenants == null || tenants.size() <= 0) {
            throw new TipsException("请先创建租户");
        } else {
            modelMap.addAttribute("tenants", tenants);
            return "tenant/user/list";
        }
    }


    //根据角色的不同显示不同的结果
    @RequestMapping(value = "/user/ajax/list")
    @ResponseBody
    public AjaxResult<User> userAjaxList(Long tenantId, int currPage, String searchKey, HttpSession session) {
        User user = SessionUtils.getUser(session);
        logger.info("用户{}的权限{}开始查询所有的操作员", user.getId(), user.getRole());
        Page<User> page = null;
//        if (user.getRole().equalsIgnoreCase(Role.ROLE_TENANTADMIN)) {
        page = userRepository.findByTenantIdAndUsernameContaining(tenantId, searchKey, PageUtils.p(currPage));
//        } else if (user.getRole().equalsIgnoreCase(Role.ROLE_SYSTEM)) {
//            page = userRepository.findAll(PageUtils.p(currPage));
//        }
        AjaxResult<User> result = AjaxResult.NewAjaxResult(page);
        return result;
    }

    @RequestMapping(value = "/user/ajax/update", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult<User> ajaxUserUpdate(User newUser) {
        return userSerevice.updateUser(newUser);
    }

    @RequestMapping(value = "/user/ajax/remove", method = RequestMethod.POST)
    @ResponseBody
    public AjaxResult<User> ajaxUserRemove(Long id) {
        return userSerevice.remove(id);
    }

    //增加租户
    @RequestMapping(value = "/user/ajax/new")
    @ResponseBody
    public AjaxResult<User> ajaxUserNew(User user) {
        return userSerevice.newUser(user);
    }
}
