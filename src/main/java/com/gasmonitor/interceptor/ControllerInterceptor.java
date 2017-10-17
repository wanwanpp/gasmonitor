package com.gasmonitor.interceptor;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Arrays;
import java.util.Map;

/**
 * Created by saplmm on 2017/10/17.
 */
public class ControllerInterceptor implements HandlerInterceptor {
    private Logger log = LoggerFactory.getLogger(ControllerInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o) throws Exception {
        StringBuffer sb = new StringBuffer(httpServletRequest.getRequestURI() + "\n");
        Map<String, String[]> params = httpServletRequest.getParameterMap();
        for (Map.Entry<String, String[]> entry : params.entrySet()) {
            sb.append(entry.getKey() + "\t\t==>\t\t" + Arrays.toString(params.get(entry.getKey())) + " \n");
        }
        log.info(sb.toString());
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) throws Exception {

    }
}
