package com.jaycekon.dubbo.controller;

import com.jaycekon.dubbo.dao.UserMapper;
import com.jaycekon.dubbo.domain.User;
import com.jaycekon.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping("/userController")
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView index() {
        User user = new User();
        user.setAge(18);
        user.setName("Adam");
        user.setPwd("123456");
        userMapper.install(user);
        ModelAndView modelAndView = new ModelAndView("/index");
        modelAndView.addObject("count", userMapper.getAll().size());
        return modelAndView;
    }

    @RequestMapping("/addUser")
    public User addUser() {
      return userService.addUser();
    }
}
