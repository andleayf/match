package com.xcy.controller;


import com.xcy.pojo.Team;
import com.xcy.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.List;

@Controller
@EnableSwagger2
public class MatchController {

    @Autowired
    TeamService teamService;
    @RequestMapping("/goMainPage")
    public String goMainPage(){
        System.out.println("请求跳转到主页");
        return "before/index";
    }
    //获取前20
    @ResponseBody
    @RequestMapping( value ="/selectTopTwenty" , method = RequestMethod.GET)
    public List<Team> selectTop20() {
        return teamService.selectTop20();
    }
    //赛事推荐
    @ResponseBody
    @RequestMapping(value = "/matchRecommend", method = RequestMethod.GET)
    public List<Team> matchRecommend() {
        return teamService.matchRecommend();
    }
}
