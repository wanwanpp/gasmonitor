package com.gasmonitor.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * Created by saplmm on 2017/6/10.
 */
@Configuration
//@EnableWebSecurity // springboot 中无需次注解，在spring中需求这个注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    Logger log = LoggerFactory.getLogger(WebSecurityConfig.class);

//    @Bean
//    UserDetailsService customUserService() {
//        return new CustomUserService();
//    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //        设置在iframe中显示内容
        http.headers().frameOptions().sameOrigin()
                .and().authorizeRequests().anyRequest().authenticated() //4
                .and().formLogin().loginPage("/login").failureUrl("/login?error").permitAll() //5
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll(); //6

    }

    //用户认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //自定义数据源认证
//        auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery("select username,passowrd,true from myusers where username = ?")
//                .authoritiesByUsernameQuery("select username,role from roles where username = ?");

        log.info("进入到configure函数，开始认证...");
//        auth.userDetailsService(customUserService());
        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
        auth.inMemoryAuthentication().withUser("wyf").password("wyf").roles("ADMIN");
        auth.inMemoryAuthentication().withUser("admin").password("admin").roles("ADMIN");
    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("resources/public");
    }
}

