package com.gasmonitor.config;

import com.gasmonitor.pros.HazelCastPros;
import com.hazelcast.config.Config;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by gyangminggen on 2017/7/4.
 */
@Configuration
public class HazelcastCacheConfig {
    private Logger logger = LoggerFactory.getLogger(HazelcastCacheConfig.class);

    @Autowired
    private HazelCastPros hazelCastPros;

    @Bean
    public Config hazelCastConfig() {
        Config config = new Config(hazelCastPros.getNameinstance());
        return config;
    }
}