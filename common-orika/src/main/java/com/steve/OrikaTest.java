package com.steve;

import com.steve.model.User;
import com.steve.model.UserVO;
import ma.glasnost.orika.MapperFacade;
import ma.glasnost.orika.MapperFactory;
import ma.glasnost.orika.impl.DefaultMapperFactory;

import java.util.Date;

/**
 * Created by SteveJobson on 2017/9/15.
 */
public class OrikaTest {
    public static void main(String[] args) {
        MapperFactory mapperFactory = new DefaultMapperFactory.Builder().build();

        mapperFactory.classMap(User.class, UserVO.class)
                .byDefault().register();
        User user = new User();
        user.setId(1);
        user.setUserId(10000);
        user.setUsername("steve");
        user.setUserAge(18);
        user.setAddress("bj");
        user.setSex("male");
        user.setCreatetime(new Date());

        MapperFacade mapperFacade = mapperFactory.getMapperFacade();
        UserVO vo = mapperFacade.map(user, UserVO.class);
        System.out.println(vo.toString());
    }
}
