package com.gasmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.Date;
import java.util.List;

//
///**
// * Created by saplmm on 2017/6/18.
// */
//
//
@Entity
public class Device {
    @Id
    @GeneratedValue
    private Long id;  //设备Id
    private String hardwareId;  //硬件Id
    private Long siteId;
    private String name;    //设备名称
    private String tokenId;
    private Integer logic;
    private Integer type;//设备类型，目前只有三种设备类型
    private String watcher;
    private Date created;
    private Integer status;
    private Long parent;
    private Integer utemperature;
    private Integer upressure;
    private Integer ustandard;
    private Integer urunning;
    private Integer usummary;
    private Integer usurplus;
    private Integer uanalog1;
    private Integer uanalog2;
    private Integer uanalog3;
    private Integer uanalog4;
    private Integer uswitch1;
    private Integer uswitch2;
    private Integer uswitch3;
    private Integer uswitch4;
    private Integer uac220;
    private Integer ubattery;
    private Integer usolar;


    @Transient
    private List<Device> children;

    public List<Device> getChildren() {
        return children;
    }

    public void setChildren(List<Device> children) {
        this.children = children;
    }

    public String getHardwareId() {
        return hardwareId;
    }

    public void setHardwareId(String hardwareId) {
        this.hardwareId = hardwareId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getLogic() {
        return logic;
    }

    public void setLogic(Integer logic) {
        this.logic = logic;
    }

    public String getWatcher() {
        return watcher;
    }

    public void setWatcher(String watcher) {
        this.watcher = watcher;
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

    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getUtemperature() {
        return utemperature;
    }

    public void setUtemperature(Integer utemperature) {
        this.utemperature = utemperature;
    }

    public Integer getUpressure() {
        return upressure;
    }

    public void setUpressure(Integer upressure) {
        this.upressure = upressure;
    }

    public Integer getUstandard() {
        return ustandard;
    }

    public void setUstandard(Integer ustandard) {
        this.ustandard = ustandard;
    }

    public Integer getUrunning() {
        return urunning;
    }

    public void setUrunning(Integer urunning) {
        this.urunning = urunning;
    }

    public Integer getUsummary() {
        return usummary;
    }

    public void setUsummary(Integer usummary) {
        this.usummary = usummary;
    }

    public Integer getUsurplus() {
        return usurplus;
    }

    public void setUsurplus(Integer usurplus) {
        this.usurplus = usurplus;
    }

    public Integer getUanalog1() {
        return uanalog1;
    }

    public void setUanalog1(Integer uanalog1) {
        this.uanalog1 = uanalog1;
    }

    public Integer getUanalog2() {
        return uanalog2;
    }

    public void setUanalog2(Integer uanalog2) {
        this.uanalog2 = uanalog2;
    }

    public Integer getUanalog3() {
        return uanalog3;
    }

    public void setUanalog3(Integer uanalog3) {
        this.uanalog3 = uanalog3;
    }

    public Integer getUanalog4() {
        return uanalog4;
    }

    public void setUanalog4(Integer uanalog4) {
        this.uanalog4 = uanalog4;
    }

    public Integer getUswitch1() {
        return uswitch1;
    }

    public void setUswitch1(Integer uswitch1) {
        this.uswitch1 = uswitch1;
    }

    public Integer getUswitch2() {
        return uswitch2;
    }

    public void setUswitch2(Integer uswitch2) {
        this.uswitch2 = uswitch2;
    }

    public Integer getUswitch3() {
        return uswitch3;
    }

    public void setUswitch3(Integer uswitch3) {
        this.uswitch3 = uswitch3;
    }

    public Integer getUswitch4() {
        return uswitch4;
    }

    public void setUswitch4(Integer uswitch4) {
        this.uswitch4 = uswitch4;
    }

    public Integer getUac220() {
        return uac220;
    }

    public void setUac220(Integer uac220) {
        this.uac220 = uac220;
    }

    public Integer getUbattery() {
        return ubattery;
    }

    public void setUbattery(Integer ubattery) {
        this.ubattery = ubattery;
    }

    public Integer getUsolar() {
        return usolar;
    }

    public void setUsolar(Integer usolar) {
        this.usolar = usolar;
    }


    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
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

