package com.steve.model;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by SteveJobson on 2017/9/15.
 */
public class UserVO implements Serializable {


    private static final long serialVersionUID = -1173910656985794331L;

    private Integer userId;
    private String username;
    private Integer userAge;
    private String sex;
    private Date createtime;

    public static long getSerialVersionUID() {
        return serialVersionUID;
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

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    @Override
    public String toString() {
        return "UserVO{" +
                "userId=" + userId +
                ", username='" + username + '\'' +
                ", userAge=" + userAge +
                ", sex='" + sex + '\'' +
                ", createtime=" + createtime +
                '}';
    }
}
