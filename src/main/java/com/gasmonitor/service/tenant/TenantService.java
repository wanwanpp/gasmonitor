package com.gasmonitor.service.tenant;

import com.gasmonitor.dao.DeviceRepository;
import com.gasmonitor.dao.TenantRepository;
import com.gasmonitor.entity.Device;
import com.gasmonitor.entity.Tenant;
import com.gasmonitor.entity.User;
import com.gasmonitor.pros.Consts;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.pros.Role;
import com.gasmonitor.service.user.UserService;
import com.gasmonitor.utils.PageUtils;
import com.gasmonitor.utils.Pinyin;
import com.gasmonitor.vo.AjaxResult;
import com.hazelcast.core.HazelcastInstance;
import com.hazelcast.core.IMap;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/6/23.
 */

@Service
@CacheConfig(cacheNames = Consts.CACHE_TENANT)
public class TenantService {
    private Logger log = LoggerFactory.getLogger(TenantService.class);

    @Autowired
    private HazelcastInstance hazelcastInstance;
    @Autowired
    private TenantRepository tenantRepository;

    @Autowired
    private UserService userService;

    @Autowired
    private DeviceRepository deviceRepository;
    @Autowired
    private HazelCastPros hazelCastPros;

    @Cacheable
    public Tenant findOne(Long tenantId) {
        return tenantRepository.findOne(tenantId);
    }


    //查找pageTenatn
    public Page<Tenant> findPageTenant(int pageNumber, int pageSize) {
        Page<Tenant> sourceCodes = tenantRepository.findAll(PageUtils.p(pageNumber, pageSize));
        return sourceCodes;
    }

    //更新租户的信息

    @Transactional
    public AjaxResult<Tenant> updateTenant(Tenant newTenant) {
        log.info("更新租户的信息:{}", newTenant);
        if (newTenant.getId() == null) {
            return AjaxResult.ErrorAjaxResult("没有找到记录");
        }

        Tenant old = tenantRepository.findOne(newTenant.getId());
        if (old == null) {
            return AjaxResult.ErrorAjaxResult();
        } else {
            old.setName(newTenant.getName());
            old.setMobile(newTenant.getMobile());
            old.setAddress(newTenant.getAddress());
            old.setCompany(newTenant.getCompany());
            old.setUser_upper(newTenant.getUser_upper());
            old.setDevice_upper(newTenant.getDevice_upper());
            old.setSite_upper(newTenant.getSite_upper());
            tenantRepository.save(old);
        }
        return new AjaxResult(old);
    }


    /**
     * 新增加一个租户
     * 1，增加一个租户
     * 2，为租户增加一个管理员：自动生成管理员的信息
     */
    @Transactional
    public Tenant newTenant(Tenant t) {
        log.info("创建一个租户:{}", t);
        //1
        t.setCreatedate(new Date());
        t = tenantRepository.save(t);
        log.info("创建之后的租户:{}", t);
        //2
        User user = new User();
        user.setUsername(Pinyin.getPinYinHeadChar(t.getCompany()) + t.getId() + "admin");
        user.setPassword(Consts.System.DEFAULT_PASSWORD);// FIXME: 2017/8/28  暂时处理成密码为123
        user.setRole(Role.ROLE_TENANTADMIN);//设置玩家角色
        user.setTenantId(t.getId());//关联tenantId
        userService.newUser(user);
        return t;
    }

    /**
     * 启动之后，初始化 map
     * 1,需要把所有的玩家和设备表对应起来
     * 2,如果租户的数据过大，需要分页处理
     * 3,如果租户和设备之间的关系所有边，也需要动态的做处理
     */
    public void initTenantMap() {
        //得到map
        IMap<String, String> map = hazelcastInstance.getMap(hazelCastPros.getMaptenant());
        //开始初始化
        List<Tenant> tenants = tenantRepository.findAll();
        for (Tenant user : tenants) {
            log.info("处理map-->tenant-->{},{}", user.getId(), user.getName());
            List<Device> devices = deviceRepository.findByTenantId(user.getId());
            for (Device d : devices) {
                log.info("处理map-->tenant{}-->device {}", user.getId(), d.getHardwareId());
                if (d.getHardwareId() != null) {    //逻辑设备不需要放进去
                    map.set(d.getHardwareId(), user.getId() + "");
                }
            }
        }
    }
}
