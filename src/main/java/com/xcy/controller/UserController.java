package com.xcy.controller;

import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping("/login")
    @ResponseBody
    public String login(User user){

        boolean result= userService.userLogin(user);
        if(result){
            return "success";
        }else {
            return "fail";
        }

    }

    @RequestMapping("/selectUser")
    @ResponseBody
    public String selectUser(User user){
     boolean isExist = userService.selectUser(user);
        return isExist? "fail":"success";
    }

    @RequestMapping("/insertUser")
    @ResponseBody
    public String insertUser(User user){
        int result =userService.insertUser(user);
        return result > 0 ? "success":"fail";
    }

}
