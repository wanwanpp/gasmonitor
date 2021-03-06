package com.gasmonitor.service.security;

import com.gasmonitor.dao.UserRepository;
import com.gasmonitor.entity.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.Date;

import static com.gasmonitor.pros.SessionCons.SESS_USER_KEY;

/**
 * Created by saplmm on 2017/7/11.
 */

@Service
public class LoginSuccHandler implements AuthenticationSuccessHandler {
    private Logger logger = LoggerFactory.getLogger(LoginSuccHandler.class);
    @Autowired
    private UserRepository userRepository;

    @Override
    public void onAuthenticationSuccess(
            HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            Authentication authentication) throws IOException, ServletException {
        if (authentication == null) {
            logger.info("onAuthenticationSuccess():authentication == null");
        }
        logger.info("登录成功之后 authentication.getName():{}", authentication.getName());

        User user = userRepository.findByUsername(authentication.getName());
        user.setLastlogin(new Date());
        user = userRepository.save(user);
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute("authName", authentication.getName());
        session.setAttribute(SESS_USER_KEY, user);
        logger.info("登录成功之后 authentication.getDetails():{}", authentication.getDetails());
        logger.info("登录成功之后 authentication.getAuthorities():{}", authentication.getAuthorities());
        logger.info("登录成功之后 session:{}", session);
        logger.info("登录成功之后 session.getId():{}", session.getId());
        httpServletResponse.sendRedirect("/index");
    }
}
