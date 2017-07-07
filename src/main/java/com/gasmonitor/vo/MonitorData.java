package com.gasmonitor.vo;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * Created by saplmm on 2017/6/13.
 * 监测数据
 */


public class MonitorData {
    private String stationId;   //监测站的ID;
    private String msg; //监测站的信息
    private String timeStr; // 监测信息时间
    private String data0; // 监测信息1
    private String data1; // 监测信息2

    public String getStationId() {
        return stationId;
    }

    public void setStationId(String stationId) {
        this.stationId = stationId;
    }

    public String getMsg() {
        return msg;
    }

    public String getTimeStr() {
        return timeStr;
    }

    public String getData0() {
        return data0;
    }

    public String getData1() {
        return data1;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public MonitorData(String stationId, String msg) {
        this.stationId = stationId;
        this.msg = msg;

        Date now = new Date();
        DateFormat dateFormatDateTimeIns = DateFormat.getDateTimeInstance();
        this.timeStr = dateFormatDateTimeIns.format(now);

        Random random0 = new Random();
        this.data0 = String.valueOf(random0.nextInt(1200));
        Random random1 = new Random(random0.nextInt());
        this.data1 = String.valueOf(random1.nextInt(1200));
    }

}
