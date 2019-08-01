package com.xcy.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MatchController {

    @RequestMapping("/goMainPage")
    public String goMainPage(){
        System.out.println("请求跳转到主页");
        return "before/index";
    }
}
