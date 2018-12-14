package com.baizhi.springbootjsp1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

    @RequestMapping("/heh")
    public String hehe(){

        //return new User(1L,"张三",2,"男",new Date());
        return "index";
    }

}
