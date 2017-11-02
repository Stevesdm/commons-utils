package com.steve.model;

import org.junit.Test;

import java.util.*;

public class CompareTest {

    private static Random random = new Random();

    private static List<User> setUsers(){
        List<User> list = new ArrayList<User>();
        User user = null;
        for (long i=1L;i<5;i++){
            user = new User();
            user.setUid(i);
            user.setAge(random.nextInt(80));
            user.setAddress("street"+i);
            user.setName("no."+i);
            user.setStatus(true);
            user.setCreateTime(new Date(System.currentTimeMillis() - 10000 * i));
            list.add(user);
        }
        return list;
    }

    @Test
    public void testCompare(){
        List<User> list = setUsers();
        Collections.sort(list, new Comparator<User>() {
            public int compare(User o1, User o2) {
                return o2.getCreateTime().compareTo(o1.getCreateTime());
            }
        });
        for(User u : list) {
            System.out.println(u);
        }


    }
}
