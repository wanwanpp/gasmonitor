package com.gasmonitor.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by saplmm on 2017/6/8.
 * 租户
 */

@Entity
public class Tenant implements Serializable {
    @Id
    @GeneratedValue
    private Long id;    //
    private String name; //
    private String contact;//联系方式
    private String mobile; //电话
    private Date createdate;//创建时间
    private Integer user_upper;
    private Integer device_upper;
    private Integer site_upper;
    private Integer status;//
    private String address;
    private String company;//公司名字
    private Long parent;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Integer getUser_upper() {
        return user_upper;
    }

    public void setUser_upper(Integer user_upper) {
        this.user_upper = user_upper;
    }

    public Integer getDevice_upper() {
        return device_upper;
    }

    public void setDevice_upper(Integer device_upper) {
        this.device_upper = device_upper;
    }

    public Integer getSite_upper() {
        return site_upper;
    }

    public void setSite_upper(Integer site_upper) {
        this.site_upper = site_upper;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Long getParent() {
        return parent;
    }

    public void setParent(Long parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        return "Tenant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", contact='" + contact + '\'' +
                ", mobile='" + mobile + '\'' +
                ", createdate=" + createdate +
                ", user_upper=" + user_upper +
                ", device_upper=" + device_upper +
                ", site_upper=" + site_upper +
                ", status=" + status +
                ", address='" + address + '\'' +
                ", company='" + company + '\'' +
                '}';
    }
}
