package com.leyou.controller;


import com.leyou.pojo.User;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/user")
public class UserController {

    @Autowired
    private User user;
//    @ResponseBody
//    @RequestMapping("/hello")
    @GetMapping("/hello")
    public String hello(){
//        log.debug("输出user的name" + user.getName());
        return "hello spring boot" + user.getName();
    }
    @GetMapping("/hello1")
    public String hello1(){
//        log.debug("输出user的name1" + user.getName());
        return "hello spring boot" + user.getName();
    }
}
