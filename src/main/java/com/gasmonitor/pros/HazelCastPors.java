package com.gasmonitor.pros;import org.springframework.boot.context.properties.ConfigurationProperties;/** * Created by saplmm on 2017/7/6. */@ConfigurationProperties(prefix = "hazelcast")public class HazelCastPors {    private String name;    public String getName() {        return name;    }    public void setName(String name) {        this.name = name;    }}