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
    private String utemperature;
    private String upressure;
    private String ustandard;
    private String urunning;
    private String usummary;//总计流量
    private String usurplus;//剩余流量
    private String uanalog1;
    private String uanalog2;
    private String uanalog3;
    private String uanalog4;
    private String uswitch1;
    private String uswitch2;
    private String uswitch3;
    private String uswitch4;
    private String uac220;
    private String ubattery;
    private String usolar;

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

    public String getUtemperature() {
        return utemperature;
    }

    public void setUtemperature(String utemperature) {
        this.utemperature = utemperature;
    }

    public String getUpressure() {
        return upressure;
    }

    public void setUpressure(String upressure) {
        this.upressure = upressure;
    }

    public String getUstandard() {
        return ustandard;
    }

    public void setUstandard(String ustandard) {
        this.ustandard = ustandard;
    }

    public String getUrunning() {
        return urunning;
    }

    public void setUrunning(String urunning) {
        this.urunning = urunning;
    }

    public String getUsummary() {
        return usummary;
    }

    public void setUsummary(String usummary) {
        this.usummary = usummary;
    }

    public String getUsurplus() {
        return usurplus;
    }

    public void setUsurplus(String usurplus) {
        this.usurplus = usurplus;
    }

    public String getUanalog1() {
        return uanalog1;
    }

    public void setUanalog1(String uanalog1) {
        this.uanalog1 = uanalog1;
    }

    public String getUanalog2() {
        return uanalog2;
    }

    public void setUanalog2(String uanalog2) {
        this.uanalog2 = uanalog2;
    }

    public String getUanalog3() {
        return uanalog3;
    }

    public void setUanalog3(String uanalog3) {
        this.uanalog3 = uanalog3;
    }

    public String getUanalog4() {
        return uanalog4;
    }

    public void setUanalog4(String uanalog4) {
        this.uanalog4 = uanalog4;
    }

    public String getUswitch1() {
        return uswitch1;
    }

    public void setUswitch1(String uswitch1) {
        this.uswitch1 = uswitch1;
    }

    public String getUswitch2() {
        return uswitch2;
    }

    public void setUswitch2(String uswitch2) {
        this.uswitch2 = uswitch2;
    }

    public String getUswitch3() {
        return uswitch3;
    }

    public void setUswitch3(String uswitch3) {
        this.uswitch3 = uswitch3;
    }

    public String getUswitch4() {
        return uswitch4;
    }

    public void setUswitch4(String uswitch4) {
        this.uswitch4 = uswitch4;
    }

    public String getUac220() {
        return uac220;
    }

    public void setUac220(String uac220) {
        this.uac220 = uac220;
    }

    public String getUbattery() {
        return ubattery;
    }

    public void setUbattery(String ubattery) {
        this.ubattery = ubattery;
    }

    public String getUsolar() {
        return usolar;
    }

    public void setUsolar(String usolar) {
        this.usolar = usolar;
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

    public Double getRunningUpper() {
        return runningUpper;
    }

    public void setRunningUpper(Double runningUpper) {
        this.runningUpper = runningUpper;
    }

    public Double getRunningFloor() {
        return runningFloor;
    }

    public void setRunningFloor(Double runningFloor) {
        this.runningFloor = runningFloor;
    }

    public Double getSummaryUpper() {
        return summaryUpper;
    }

    public void setSummaryUpper(Double summaryUpper) {
        this.summaryUpper = summaryUpper;
    }

    public Double getSummaryFloor() {
        return summaryFloor;
    }

    public void setSummaryFloor(Double summaryFloor) {
        this.summaryFloor = summaryFloor;
    }

    public Double getSurplusUpper() {
        return surplusUpper;
    }

    public void setSurplusUpper(Double surplusUpper) {
        this.surplusUpper = surplusUpper;
    }

    public Double getSurplusFloor() {
        return surplusFloor;
    }

    public void setSurplusFloor(Double surplusFloor) {
        this.surplusFloor = surplusFloor;
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

    public List<Device> getChildren() {
        return children;
    }

    public void setChildren(List<Device> children) {
        this.children = children;
    }
}

