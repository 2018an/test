package com.jaycekon.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.jaycekon.dubbo.dao.UserMapper;
import com.jaycekon.dubbo.domain.User;
import com.jaycekon.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by Jaycekon on 2017/9/19.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public User saveUser(User user) {
        user.setId(1L);
        System.out.println(user.toString());
        return user;
    }

    @Override
    public User addUser() {
        User user = new User()
                .setAge(20)
                .setName("XXX")
                .setPwd("123456");
        userMapper.install(user);
        return user;
    }
}
