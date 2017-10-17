package com.gasmonitor.pros;

/**
 * Created by saplmm on 2017/8/13.
 */
public class Consts {
    public static class System {
        public static final String DEFAULT_PASSWORD = "123";  //租户的缓存
    }

    //缓存user
    public static final String CACHE_TENANT = "c_tenant";  //租户的缓存
    public static final String CACHE_USER = "c_user";  //user缓存
    public static final String CACHE_USER_TENANT = "c_user_tenant";  //通过tenant缓存的user
    public static final String CACHE_USER_S = "c_user_single";  //user缓存单个
    public static final String CACHE_USER_ALL = "c_user_all";  //user缓存list


    //缓存设备
    public static final String CACHE_DEVICE = "c_device";  //设备缓存
    public static final String CACHE_DEVICE_ID = "c_device_id";  //设备缓存
    public static final String CACHE_DEVICE_HARDWAREID = "c_device_hardwareId";  //设备缓存，通过硬件id
    public static final String CACHE_DEVICE_LIST_SITE = "c_device_list_site";  //设备列表通过站点

    //缓存站点
    public static class CACHE {
        public static class SITE {
            public static final String NAME = "c_site";  //站点缓存名字
            public static final String ID = "c_site_id";  //通过ID缓存站点
        }
    }

    //缓存基本数据
    public static final String CACHE_BASDEVICEUNIT = "c_basdeviceunit";  //设备缓存

    //警告状态
    public static class Device {
        public static final int STATUS_KEYONG = 0;
        public static final int STATUS_INIT = 1;
        public static final int STATUS_GAOJING = 2;     //处于告警状态
        public static final int STATUS_TINGYONG = 4;    //停用
    }

    //告警时间的状态
    public static class Event {
        public static final int STATUS_INIT = 1;    //默认告警状态
        public static final int STATUS_DOEN = 2;    //处理
        public static final int STATUS_IGNORE = 3;  //忽略
    }

}
