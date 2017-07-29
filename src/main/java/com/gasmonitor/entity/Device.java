package com.gasmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

//
///**
// * Created by saplmm on 2017/6/18.
// */
//
//
@Entity
public class Device implements Serializable {
    @Id
    @GeneratedValue
    private Long id;  //设备Id
    private String hardwareId;  //硬件Id
    private Long siteId;
    private String name;    //设备名称
    private String tokenId;
    private Integer logic;
    private Integer type;//设备类型，目前只有三种设备类型
    private Long watcher;   //由谁来监控
    private Date created;
    private Integer status;
    private Long parent;
    private Long utemperature;
    private Long upressure;
    private Long ustandard;
    private Long urunning;
    private Long usummary;
    private Long usurplus;
    private Long uanalog1;
    private Long uanalog2;
    private Long uanalog3;
    private Long uanalog4;
    private Long uswitch1;
    private Long uswitch2;
    private Long uswitch3;
    private Long uswitch4;
    private Long uac220;
    private Long ubattery;
    private Long usolar;

    private Integer standardFlowUpper;
    private Integer temperatureUpper;
    private Integer temperatureLow;
    private Integer pressureUpper;
    private Integer pressureLow;

    @Transient
    private List<Device> children;

    public Long getWatcher() {
        return watcher;
    }

    public void setWatcher(Long watcher) {
        this.watcher = watcher;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    public Long getUtemperature() {
        return utemperature;
    }

    public void setUtemperature(Long utemperature) {
        this.utemperature = utemperature;
    }

    public Long getUpressure() {
        return upressure;
    }

    public void setUpressure(Long upressure) {
        this.upressure = upressure;
    }

    public Long getUstandard() {
        return ustandard;
    }

    public void setUstandard(Long ustandard) {
        this.ustandard = ustandard;
    }

    public Long getUrunning() {
        return urunning;
    }

    public void setUrunning(Long urunning) {
        this.urunning = urunning;
    }

    public Long getUsummary() {
        return usummary;
    }

    public void setUsummary(Long usummary) {
        this.usummary = usummary;
    }

    public Long getUsurplus() {
        return usurplus;
    }

    public void setUsurplus(Long usurplus) {
        this.usurplus = usurplus;
    }

    public Long getUanalog1() {
        return uanalog1;
    }

    public void setUanalog1(Long uanalog1) {
        this.uanalog1 = uanalog1;
    }

    public Long getUanalog2() {
        return uanalog2;
    }

    public void setUanalog2(Long uanalog2) {
        this.uanalog2 = uanalog2;
    }

    public Long getUanalog3() {
        return uanalog3;
    }

    public void setUanalog3(Long uanalog3) {
        this.uanalog3 = uanalog3;
    }

    public Long getUanalog4() {
        return uanalog4;
    }

    public void setUanalog4(Long uanalog4) {
        this.uanalog4 = uanalog4;
    }

    public Long getUswitch1() {
        return uswitch1;
    }

    public void setUswitch1(Long uswitch1) {
        this.uswitch1 = uswitch1;
    }

    public Long getUswitch2() {
        return uswitch2;
    }

    public void setUswitch2(Long uswitch2) {
        this.uswitch2 = uswitch2;
    }

    public Long getUswitch3() {
        return uswitch3;
    }

    public void setUswitch3(Long uswitch3) {
        this.uswitch3 = uswitch3;
    }

    public Long getUswitch4() {
        return uswitch4;
    }

    public void setUswitch4(Long uswitch4) {
        this.uswitch4 = uswitch4;
    }

    public Long getUac220() {
        return uac220;
    }

    public void setUac220(Long uac220) {
        this.uac220 = uac220;
    }

    public Long getUbattery() {
        return ubattery;
    }

    public void setUbattery(Long ubattery) {
        this.ubattery = ubattery;
    }

    public Long getUsolar() {
        return usolar;
    }

    public void setUsolar(Long usolar) {
        this.usolar = usolar;
    }

    public List<Device> getChildren() {
        return children;
    }

    public void setChildren(List<Device> children) {
        this.children = children;
    }

    public Integer getStandardFlowUpper() {
        return standardFlowUpper;
    }

    public void setStandardFlowUpper(Integer standardFlowUpper) {
        this.standardFlowUpper = standardFlowUpper;
    }

    public Integer getTemperatureUpper() {
        return temperatureUpper;
    }

    public void setTemperatureUpper(Integer temperatureUpper) {
        this.temperatureUpper = temperatureUpper;
    }

    public Integer getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(Integer temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public Integer getPressureUpper() {
        return pressureUpper;
    }

    public void setPressureUpper(Integer pressureUpper) {
        this.pressureUpper = pressureUpper;
    }

    public Integer getPressureLow() {
        return pressureLow;
    }

    public void setPressureLow(Integer pressureLow) {
        this.pressureLow = pressureLow;
    }

    @Override
    public String toString() {
        return "Device{" +
                "id=" + id +
                ", hardwareId='" + hardwareId + '\'' +
                ", siteId=" + siteId +
                ", name='" + name + '\'' +
                ", tokenId='" + tokenId + '\'' +
                ", logic=" + logic +
                ", type=" + type +
                ", watcher='" + watcher + '\'' +
                ", created=" + created +
                ", status=" + status +
                ", parent=" + parent +
                ", utemperature=" + utemperature +
                ", upressure=" + upressure +
                ", ustandard=" + ustandard +
                ", urunning=" + urunning +
                ", usummary=" + usummary +
                ", usurplus=" + usurplus +
                ", uanalog1=" + uanalog1 +
                ", uanalog2=" + uanalog2 +
                ", uanalog3=" + uanalog3 +
                ", uanalog4=" + uanalog4 +
                ", uswitch1=" + uswitch1 +
                ", uswitch2=" + uswitch2 +
                ", uswitch3=" + uswitch3 +
                ", uswitch4=" + uswitch4 +
                ", uac220=" + uac220 +
                ", ubattery=" + ubattery +
                ", usolar=" + usolar +
                ", children=" + children +
                '}';
    }
}

