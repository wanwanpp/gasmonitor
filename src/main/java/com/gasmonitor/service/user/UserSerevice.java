package com.gasmonitor.service.user;

import com.gasmonitor.dao.UserRepository;
import com.gasmonitor.entity.User;
import com.gasmonitor.pros.Status;
import com.gasmonitor.vo.AjaxResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by saplmm on 2017/7/24.
 */

@Service
public class UserSerevice implements Serializable {

    private Logger log = LoggerFactory.getLogger(UserSerevice.class);

    @Autowired
    private UserRepository userRepository;

    @Transactional
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
            old = userRepository.save(old);
        }
        return new AjaxResult(old);
    }


    //新增一个操作员
    public AjaxResult<User> newUser(User user) {
        //新增加一个操作员
        user.setCreatedate(new Date());
        user.setStatus(Status.User.STATUS_DEFAULT);
        userRepository.save(user);
        return AjaxResult.SuccAjaxResult();
    }

    //删除一个操作员
    public AjaxResult<User> remove(Long id) {
        //todo 目前暂时直接从数据库删除，删除之前 需要删除其他的级联?
        userRepository.delete(id);
        return AjaxResult.SuccAjaxResult();
    }
}
