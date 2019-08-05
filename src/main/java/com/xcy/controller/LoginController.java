package com.xcy.controller;

import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){

        boolean result= userService.userLogin(user);
        if(result){
            System.out.println(1);
            return "success";
        }else {
            System.out.println(2);
            return "fail";
        }

    }
}
