package com.gasmonitor.vo;

import com.gasmonitor.entity.GasEvent;
import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.Date;

/**
 * Created by saplmm on 2017/6/13.
 * 监测数据
 */


public class MonitorData {
    //监控信息
    private GasEvent gasEvent;
    private boolean gaojing;
    private String msg;

    public static MonitorData NewByGasEvent(GasEvent event) {
        MonitorData data = new MonitorData();
        data.setGasEvent(event);
        return data;
    }

    public boolean getGaojing() {
        return gaojing;
    }

    public void setGaojing(boolean gaojing) {
        this.gaojing = gaojing;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public GasEvent getGasEvent() {
        return gasEvent;
    }

    public void setGasEvent(GasEvent gasEvent) {
        this.gasEvent = gasEvent;
    }
}
