package com.steve.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SteveJobson on 2017/9/15.
 */
public class User implements Serializable {

    private static final long serialVersionUID = -5108867664400399282L;

    private Integer id;
    private Integer userId;
    private String username;
    private Integer userAge;
    private String sex;
    private String address;
    private Date createtime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", userId=" + userId +
                ", username='" + username + '\'' +
                ", userAge=" + userAge +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
