package com.steve.model;

import org.hibernate.validator.constraints.Length;
import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Person {

    private Long id;

    @NotNull(message = "参数[name]不能为空")
    @Length(min = 2,max = 4,message = "参数[name]长度在2-4位之间")
    private String name;

    @Max(value = 80,message = "参数最大不能超过80")
    @Min(value = 1,message = "参数[age]最小不能小于1")
    private int age;

    @NotEmpty(message = "参数[address]不能为空")
    private String address;

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
}
