package com.steve.model;

import java.io.Serializable;
import java.util.List;

public class Group implements Serializable {
    private static final long serialVersionUID = -4515402053602892494L;

    private int gid;
    private String gname;
    private List<User> userList;


    public int getGid() {
        return gid;
    }

    public void setGid(int gid) {
        this.gid = gid;
    }

    public String getGname() {
        return gname;
    }

    public void setGname(String gname) {
        this.gname = gname;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }
}
