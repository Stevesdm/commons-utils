package com.steve.fastjson;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.steve.model.Group;
import com.steve.model.User;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Random;

public class demo1 {
    /**
     * FastJson 文档：https://www.w3cschool.cn/fastjson/fastjson-api.html
     */

    private static Random random = new Random();

    private static List<User> setUsers() {
        List<User> list = new ArrayList<User>();
        User user = null;
        for (long i = 1L; i < 500; i++) {
            user = new User();
            user.setUid(i);
            user.setAge(random.nextInt(80));
            user.setAddress("street" + i);
            user.setName("no." + i);
            user.setStatus(true);
            user.setCreateTime(new Date());
            list.add(user);
        }
        return list;
    }


    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Group g = new Group();
        g.setGid(1);
        g.setGname("group1");
        g.setUserList(setUsers());
        String json = JSON.toJSONString(g);
        System.out.println(json);
        long end = System.currentTimeMillis();
        System.out.println("运行了：" + (end - start));

        JSONObject jsonObject = JSON.parseObject(json);
        System.out.println(jsonObject);
        JSONArray jsonArray = jsonObject.getJSONArray("userList");
        System.out.println(jsonArray);
        JSONObject json1 = (JSONObject) jsonArray.get(0);
        System.out.println(json1.getDate("createTime"));

    }
}
