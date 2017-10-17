package com.gasmonitor.entity;

import com.gasmonitor.utils.SessionUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpSession;

/**
 * Created by saplmm on 2017/10/17.
 */

@Component
public class SessionUser {

    @Autowired
    private HttpSession httpSession;

    public User getUser() {
        return SessionUtils.getUser(httpSession);
    }
}
