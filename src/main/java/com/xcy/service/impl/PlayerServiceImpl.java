package com.xcy.service.impl;

import com.xcy.mapper.PlayerMapper;
import com.xcy.pojo.Match;
import com.xcy.pojo.Player;
import com.xcy.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class PlayerServiceImpl implements PlayerService {
    @Autowired
    PlayerMapper playerMapper;
    @Override
    public List<Player> selectTop10Player() {
        return playerMapper.selectTop10Player();
    }

    @Override
    public List<Player> selectTop10Teamr() {
        return playerMapper.selectTop10Teamr();
    }

    @Override
    public List<Player> selectTop5Match() {
        return playerMapper.selectTop5Match();
    }

    @Override
    public List<Player> selectTop5Match1() {
        return playerMapper.selectTop5Match1();
    }

    @Override
    public List<Player> selectTop5Match2() {
        return playerMapper.selectTop5Match2();
    }
}
