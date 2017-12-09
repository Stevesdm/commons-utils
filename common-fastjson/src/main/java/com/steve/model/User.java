package com.steve.model;

import com.alibaba.fastjson.annotation.JSONField;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable, Comparable {

    private static final long serialVersionUID = -5108867664400399282L;
    //ordinal设置字段序列化顺序
    //format设置输出格式
    @JSONField(name = "user_id", ordinal = 0)
    private Long uid;
    @JSONField(ordinal = 1)
    private String name;
    @JSONField(ordinal = 2)
    private int age;
    @JSONField(ordinal = 3)
    private String address;
    @JSONField(ordinal = 4)
    private Boolean status;
    @JSONField(ordinal = 5, format = "yyyy-MM-dd")
    private Date createTime;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public int compareTo(Object object) {
        if (object instanceof User) {
            User user = (User) object;
            int result = 0;
            result = user.getCreateTime().compareTo(getCreateTime());
            if (result == 0) {
                result = getName().compareTo(user.getName());
            }
            return result;
        }
        return 0;
    }

    @Override
    public String toString() {
        return "User{" +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", address='" + address + '\'' +
                ", status=" + status +
                ", createTime=" + createTime +
                '}';
    }
}
