package com.gasmonitor.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.session.MapSessionRepository;
import org.springframework.session.config.annotation.web.http.EnableSpringHttpSession;

/**
 * Created by saplmm on 2017/7/10.
 */

//@EnableRedisHttpSession
@Configuration
@EnableSpringHttpSession
public class HttpSessionConfig {
    @Bean
    public MapSessionRepository sessionRepository() {
        MapSessionRepository session = new MapSessionRepository();
//        session.setDefaultMaxInactiveInterval(60 * 60); //设置session超时时间
        session.setDefaultMaxInactiveInterval(20); //设置session超时时间
        return session;
    }
}
