package com.gasmonitor.service.user;

import com.gasmonitor.dao.UserRepository;
import com.gasmonitor.entity.User;
import com.gasmonitor.pros.Consts;
import com.gasmonitor.pros.HazelCastPros;
import com.gasmonitor.pros.Status;
import com.gasmonitor.utils.EncryptUtil;
import com.gasmonitor.vo.AjaxResult;
import com.hazelcast.core.HazelcastInstance;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.*;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * Created by saplmm on 2017/7/24.
 */

@Service
@CacheConfig(cacheNames = Consts.CACHE_USER)
public class UserService {

    private Logger log = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserRepository userRepository;
    @Autowired
    private HazelcastInstance hazelcastInstance;
    @Autowired
    private HazelCastPros hazelCastPros;


    /**
     * 修改用户的密码
     *
     * @param user
     * @param newPassword
     */

    @Transactional(rollbackFor = Exception.class)
    public void updatePassword(User user, String newPassword) {
        user.setPassword(EncryptUtil.encrypt(newPassword));
        userRepository.updatePassword(user.getPassword(), user.getId());
    }

    /**
     * 更新usr
     *
     * @param newUser
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    @CacheEvict(allEntries = true)  //清空所有的缓存
    public AjaxResult<User> updateUser(User newUser) {
        log.info("更新user的信息:{}", newUser);
        if (newUser.getId() == null) {
            return AjaxResult.ErrorAjaxResult("没有找到记录");
        }

        User old = userRepository.findOne(newUser.getId());
        if (old == null) {
            return AjaxResult.ErrorAjaxResult();
        } else {
            old.setRole(newUser.getRole());
            old.setMobile(newUser.getMobile());
            old.setAddress(newUser.getAddress());
            old.setUsername(newUser.getUsername());
            old.setPassword(EncryptUtil.encrypt(newUser.getPassword()));
            old = userRepository.save(old);
        }
        //更新缓存
//        loadUserMap(old);
        return new AjaxResult(old);
    }


    //新增一个操作员
    @CacheEvict(key = "'" + Consts.CACHE_USER_TENANT + "'" + "+#p0")
    public AjaxResult<User> newUser(User user) {
        //新增加一个操作员
        user.setCreatedate(new Date());
        if (StringUtils.isEmpty(user.getPassword())) {
            user.setPassword(Consts.System.DEFAULT_PASSWORD);
        }
        user.setStatus(Status.User.STATUS_DEFAULT);
        user = userRepository.save(user);
        return AjaxResult.NewAjaxResult(user);
    }

    //删除一个操作员
    @CacheEvict(key = "'" + Consts.CACHE_USER_TENANT + "'" + "+#p0")
    public AjaxResult<User> remove(Long id) {
        userRepository.delete(id);
        return AjaxResult.SuccAjaxResult();
    }

    @Cacheable(key = "#p0", condition = "#p0!=null")
    public User findOne(Long id) {
        return userRepository.findOne(id);
    }

    //通过tenant缓存的user
    @Cacheable(key = "'" + Consts.CACHE_USER_TENANT + "'+#p0")
    public List<User> findUserByTenantId(Long tenantId) {
        return userRepository.findByTenantId(tenantId);
    }
}

