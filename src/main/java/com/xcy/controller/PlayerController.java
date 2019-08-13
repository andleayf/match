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
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/top")
@ApiModel("精彩top10")
public class PlayerController {
    @Autowired
    PlayerService playerService;

    @RequestMapping(value ="/top10player",method = RequestMethod.GET)
    @ApiOperation(value ="前10名玩家")
    @ResponseBody

    public List<Player> selectTop10Player(){
        List<Player> list=playerService.selectTop10Player();
        //System.out.println(JsonUtils.objectToJson(list));
        return list;
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
    @ResponseBody

    public List<Player> selectTop5Match(int detailsId){
        System.out.println(detailsId);
        if (detailsId==0){
            List<Player> list=playerService.selectTop5Match();

            return list;
        }else if (detailsId==1){
            List<Player> list=playerService.selectTop5Match1();
            System.out.println(JsonUtils.objectToJson(list));
            return list;
        }else {
            List<Player> list=playerService.selectTop5Match2();
            System.out.println(JsonUtils.objectToJson(list));
            return list;
        }


    }
}
