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
    private String factory;//生产厂家
    private String tokenId;
    private Integer logic;
    private Integer dtype;//设备类型，目前只有三种设备类型
    private Long watcher;   //由谁来监控
    private Date created;
    private Integer status;
    private Long parent;
    private Long utemperature;
    private Long upressure;
    private Long ustandard;
    private Long urunning;
    private Long usummary;//总计流量
    private Long usurplus;//剩余流量
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

    private Double standardUpper;
    private Double standardFloor;

    private Double runningUpper;
    private Double runningFloor;
    private Double summaryUpper;
    private Double summaryFloor;

    private Double surplusUpper;
    private Double surplusFloor;

    private Double temperatureUpper;
    private Double temperatureLow;
    private Double pressureUpper;
    private Double pressureLow;

    private Double uanalog1Upper;
    private Double uanalog2Upper;
    private Double uanalog3Upper;
    private Double uanalog4Upper;
    private Double uanalog1Floor;
    private Double uanalog2Floor;
    private Double uanalog3Floor;
    private Double uanalog4Floor;

    private Long uac220Floor;
    private Long ubatteryFloor;
    private Long usolarFloor;


    @Transient
    private List<Device> children;

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

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
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

    public Integer getDtype() {
        return dtype;
    }

    public void setDtype(Integer dtype) {
        this.dtype = dtype;
    }

    public Long getWatcher() {
        return watcher;
    }

    public void setWatcher(Long watcher) {
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

    public Double getTemperatureUpper() {
        return temperatureUpper;
    }

    public void setTemperatureUpper(Double temperatureUpper) {
        this.temperatureUpper = temperatureUpper;
    }

    public Double getTemperatureLow() {
        return temperatureLow;
    }

    public void setTemperatureLow(Double temperatureLow) {
        this.temperatureLow = temperatureLow;
    }

    public Double getPressureUpper() {
        return pressureUpper;
    }

    public void setPressureUpper(Double pressureUpper) {
        this.pressureUpper = pressureUpper;
    }

    public Double getPressureLow() {
        return pressureLow;
    }

    public void setPressureLow(Double pressureLow) {
        this.pressureLow = pressureLow;
    }

    public Double getUanalog1Upper() {
        return uanalog1Upper;
    }

    public void setUanalog1Upper(Double uanalog1Upper) {
        this.uanalog1Upper = uanalog1Upper;
    }

    public Double getUanalog2Upper() {
        return uanalog2Upper;
    }

    public void setUanalog2Upper(Double uanalog2Upper) {
        this.uanalog2Upper = uanalog2Upper;
    }

    public Double getUanalog3Upper() {
        return uanalog3Upper;
    }

    public void setUanalog3Upper(Double uanalog3Upper) {
        this.uanalog3Upper = uanalog3Upper;
    }

    public Double getUanalog4Upper() {
        return uanalog4Upper;
    }

    public void setUanalog4Upper(Double uanalog4Upper) {
        this.uanalog4Upper = uanalog4Upper;
    }

    public Double getUanalog1Floor() {
        return uanalog1Floor;
    }

    public void setUanalog1Floor(Double uanalog1Floor) {
        this.uanalog1Floor = uanalog1Floor;
    }

    public Double getUanalog2Floor() {
        return uanalog2Floor;
    }

    public void setUanalog2Floor(Double uanalog2Floor) {
        this.uanalog2Floor = uanalog2Floor;
    }

    public Double getUanalog3Floor() {
        return uanalog3Floor;
    }

    public void setUanalog3Floor(Double uanalog3Floor) {
        this.uanalog3Floor = uanalog3Floor;
    }

    public Double getUanalog4Floor() {
        return uanalog4Floor;
    }

    public void setUanalog4Floor(Double uanalog4Floor) {
        this.uanalog4Floor = uanalog4Floor;
    }

    public List<Device> getChildren() {
        return children;
    }

    public void setChildren(List<Device> children) {
        this.children = children;
    }

    public Long getUac220Floor() {
        return uac220Floor;
    }

    public void setUac220Floor(Long uac220Floor) {
        this.uac220Floor = uac220Floor;
    }

    public Long getUbatteryFloor() {
        return ubatteryFloor;
    }

    public void setUbatteryFloor(Long ubatteryFloor) {
        this.ubatteryFloor = ubatteryFloor;
    }

    public Long getUsolarFloor() {
        return usolarFloor;
    }

    public void setUsolarFloor(Long usolarFloor) {
        this.usolarFloor = usolarFloor;
    }

    public Double getStandardUpper() {
        return standardUpper;
    }

    public void setStandardUpper(Double standardUpper) {
        this.standardUpper = standardUpper;
    }

    public Double getStandardFloor() {
        return standardFloor;
    }

    public void setStandardFloor(Double standardFloor) {
        this.standardFloor = standardFloor;
    }
}

