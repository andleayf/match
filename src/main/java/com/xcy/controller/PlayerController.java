package com.xcy.controller;
import	java.util.List;

import com.xcy.pojo.Match;
import com.xcy.pojo.Player;
import com.xcy.service.PlayerService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/top")
@ApiModel("精彩top10")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @RequestMapping(value ="/top10player",method = RequestMethod.GET)
    @ApiOperation(value ="前10名玩家")

    public String selectTop10Player(){
        List<Player> list=playerService.selectTop10Player();
        return JsonUtils.objectToJson(list);
    }

    @RequestMapping(value ="/top10team",method = RequestMethod.GET)
    @ApiOperation(value ="前10名球队")

    public String selectTop10Teamr(){
        List<Player> list=playerService.selectTop10Teamr();
        System.out.println(JsonUtils.objectToJson(list));
        return JsonUtils.objectToJson(list);
    }

    @RequestMapping(value ="/top5Match",method = RequestMethod.GET)
    @ApiOperation(value ="前10名球队 detailId 为状态值 0为今天 1为这周 2为这月")

    public String selectTop5Match(Match detailsId){
        System.out.println(detailsId);
        List<Player> list=playerService.selectTop5Match(detailsId);
        System.out.println(JsonUtils.objectToJson(list));
        return JsonUtils.objectToJson(list);
    }
}
