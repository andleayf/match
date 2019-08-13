package com.xcy.controller;
import com.xcy.pojo.Type;
import com.xcy.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TypeController {
    //获取所有项目
    @Autowired
    TypeService typeService;
    @RequestMapping("/selectAllType")
    public List<Type> selectAllType(){
        return typeService.selectAllType();
    }

    //根据id获取项目的地址
    @RequestMapping("/getUrl")
    public String getUrl(int id) {
        return typeService.getUrl(id);
    }
    //模糊查询
    @RequestMapping("/likeSelect")
    public List<Type> likeSelect(String name) {
        return typeService.likeSelect(name);
    }

}
