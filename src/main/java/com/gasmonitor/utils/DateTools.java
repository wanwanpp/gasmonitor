package com.gasmonitor.utils;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by saplmm on 2017/8/14.
 */
public class DateTools {
    public static Date addHour(Date old, Integer h) {
        Calendar cal = Calendar.getInstance();
        cal.setTime(old);//date 换成已经已知的Date对象
        cal.add(Calendar.HOUR, h);//
        return cal.getTime();
    }
}
