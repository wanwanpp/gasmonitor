package com.gasmonitor.config;

import com.gasmonitor.service.login.LoginSuccHandler;
import com.gasmonitor.service.security.CustomUserDetailsService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationDetailsSource;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.authentication.WebAuthenticationDetails;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by saplmm on 2017/6/10.
 */
@Configuration
//@EnableWebSecurity // springboot 中无需次注解，在spring中需求这个注解
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    Logger log = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Value("${server.salt}")
    private String salt;

    @Autowired
    private LoginSuccHandler loginSuccHandler;

    @Autowired
    private AuthenticationProvider authenticationProvider;  //AuthenticationProvider提供登录验证处理逻辑，我们实现该接口编写自己的验证逻辑。


    @Autowired
    private AuthenticationDetailsSource<HttpServletRequest, WebAuthenticationDetails> authenticationDetailsSource;


    @Autowired
    private CustomUserDetailsService customUserDetailsService;

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //        设置在iframe中显示内容
        http.csrf().disable();
        http.headers().frameOptions().sameOrigin()
                .and().authorizeRequests().antMatchers("/test/**").permitAll()
                .and().authorizeRequests().anyRequest().authenticated() //4
                .and().formLogin().loginPage("/login").failureUrl("/login?error").successHandler(loginSuccHandler).authenticationDetailsSource(authenticationDetailsSource).permitAll() //5
                .and().logout().logoutUrl("/logout").logoutSuccessUrl("/login").permitAll();
    }

    //用户认证
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //自定义数据源认证
//        auth.jdbcAuthentication().dataSource(dataSource)
//                .usersByUsernameQuery("select username,passowrd,true from myusers where username = ?")
//                .authoritiesByUsernameQuery("select username,role from roles where username = ?");

        log.info("进入到configure函数，开始认证...");
        auth.userDetailsService(customUserDetailsService);
        auth.authenticationProvider(authenticationProvider);
        //下边的方法 可以用于增加用户的md5摘要
//        auth.userDetailsService(customUserService()).passwordEncoder(new PasswordEncoder() {
//            @Override
//            public String encode(CharSequence rawPassword) {
//               new  Md5PasswordEncoder().encodePassword()
//                return null;
//            }
//
//            @Override
//            public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                return false;
//            }
//        });
//        auth.inMemoryAuthentication().withUser("user").password("user").roles("USER");
//        auth.inMemoryAuthentication().withUser("admin").password("123").roles("ADMIN");
//        auth.inMemoryAuthentication().withUser("tenantadmin").password("123").roles("TENANTADMIN");
//        auth.inMemoryAuthentication().withUser("system").password("123").roles("SYSTEM");

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring().antMatchers("/css/**");
        web.ignoring().antMatchers("/fonts/**");
        web.ignoring().antMatchers("/img/**");
        web.ignoring().antMatchers("/js/**");
        web.ignoring().antMatchers("/layui/**");
    }
}

