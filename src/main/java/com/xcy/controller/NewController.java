package com.xcy.controller;

import com.xcy.pojo.Player;
import com.xcy.service.NewService;
import com.xcy.service.PlayerService;
import com.xcy.utils.JsonUtils;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static com.xcy.utils.timeUtils.getBeapartDate;
import static com.xcy.utils.timeUtils.getSecond;

@Controller
@RequestMapping("/new")
@ApiModel("新闻")
public class NewController {
    @Autowired
    NewService newService;

    @RequestMapping(value ="/headnew",method = RequestMethod.GET)
    @ApiOperation(value ="头条新闻")
    public String selectHeadNew() throws Exception{
        List<Player> list=newService.selectHeadNew();

        Date now=new Date();
        SimpleDateFormat f   =   new   SimpleDateFormat("yyyy-MM-dd HH:mm");
        String time =  new   SimpleDateFormat("yyyy-MM-dd HH:mm").format(new Date());
        Date end = null;

            end = f.parse(time);
            java.util.Date   begin=   f.parse("2019-08-01 23:35:45");
            String xx = getBeapartDate(getSecond(end,begin));
            System.out.println(xx);

            Map<String,List <Player>> map=new HashMap<String,List <Player>>();
            List<Player> list1 = map.put(xx, list);
        System.out.println(list1);
            return JsonUtils.objectToJson(list1);
    }


    @RequestMapping(value ="/moreNew",method = RequestMethod.GET)
    @ApiOperation(value ="更多新闻")

    public String selectMoreNew(){
        List<Player> list=newService.selectMoreNew();
        return JsonUtils.objectToJson(list);
    }






}
