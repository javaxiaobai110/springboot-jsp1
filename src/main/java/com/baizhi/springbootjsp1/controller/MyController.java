package com.baizhi.springbootjsp1.controller;


import com.baizhi.springbootjsp1.domain.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class MyController {

    @RequestMapping("/heh")
    public User hehe(){

        return new User(1L,"张三",2,"男",new Date());
    }

}
