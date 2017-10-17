package com.gasmonitor;

import com.gasmonitor.pros.HazelCastPros;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication  //springboot
@EnableTransactionManagement    //开启事物
@EnableConfigurationProperties({HazelCastPros.class})//增加配置文件
@EnableAsync    //开启异步任务
@EnableCaching  //开启缓存
/**
 * 应用入口
 */
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        application.run(args);
    }
}
