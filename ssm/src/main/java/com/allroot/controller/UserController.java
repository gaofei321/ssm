package com.allroot.controller;

import com.allroot.pojo.User;
import com.allroot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    private UserService userServiceImpl;
    @RequestMapping("/hello")
    public String hello(){
        List<User> userList = userServiceImpl.findAll();
        for(User user:userList){
            System.out.println("id->>>"+user.getId());
            System.out.println("id->>>"+user.getUserName());
            System.out.println("id->>>"+user.getPassword());
        }
        System.out.println("跳转到hello.jsp.........");
        return "hello";
    }

    @RequestMapping("/home")
    public String home(){
        return "redirect:hello";
    }





}
