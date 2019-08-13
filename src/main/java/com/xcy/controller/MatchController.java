package com.xcy.controller;

import com.xcy.pojo.Match;
import com.xcy.service.MatchService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MatchController {

    @Autowired
    MatchService matchService;

    /**
     *
     * @param id
     * @return
     */
    @GetMapping("/getMatchDetail")
    @ResponseBody
    @ApiOperation("直播详情")
    public Match getMatchDetail(int id){
        Match match = matchService.getMatchDetail(id);
        System.out.println(match);
        return match;
    }


}
