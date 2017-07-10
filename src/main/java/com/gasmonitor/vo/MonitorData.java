package com.gasmonitor.vo;

import com.gasmonitor.entity.GasEvent;

/**
 * Created by saplmm on 2017/6/13.
 * 监测数据
 */


public class MonitorData {
    //监控信息
    private GasEvent gasEvent;

    public GasEvent getGasEvent() {
        return gasEvent;
    }

    public void setGasEvent(GasEvent gasEvent) {
        this.gasEvent = gasEvent;
    }
}
