package com.example.demo.controller;

import com.example.demo.pojo.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
    @Autowired
    UserService userService;


    @RequestMapping("/login")
    @ResponseBody
    public String login(User user) {

        User loginUser = userService.login(user);
        if (loginUser != null){
            return "success";
        }else{
            return "false";
        }

    }

}
