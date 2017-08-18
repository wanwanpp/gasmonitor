package com.gasmonitor.vo;

/**
 * Created by saplmm on 2017/8/13.
 */
public class SysInfoVo {
    private Long tenantCount;
    private Long deviceCount;
    private String msg;

    public Long getTenantCount() {
        return tenantCount;
    }

    public void setTenantCount(Long tenantCount) {
        this.tenantCount = tenantCount;
    }

    public Long getDeviceCount() {
        return deviceCount;
    }

    public void setDeviceCount(Long deviceCount) {
        this.deviceCount = deviceCount;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
