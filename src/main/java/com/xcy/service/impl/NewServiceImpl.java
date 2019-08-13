package com.xcy.service.impl;

import com.xcy.mapper.NewMapper;
import com.xcy.pojo.News;
import com.xcy.pojo.Player;
import com.xcy.service.NewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NewServiceImpl implements NewService {
    @Autowired
    NewMapper newMapper;
    @Override
    public List<Player> selectHeadNew(News news) {
        return newMapper.selectHeadNew(news);
    }

    @Override
    public List<Player> selectMoreNew() {
        return newMapper.selectMoreNew();
    }
}
