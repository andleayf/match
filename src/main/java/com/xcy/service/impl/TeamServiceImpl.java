package com.xcy.service.impl;

import com.xcy.pojo.Team;
import com.xcy.repository.TeamMapper;
import com.xcy.service.TeamService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeamServiceImpl implements TeamService {

    @Autowired
    TeamMapper teamMapper;
    @Override
    public List<Team> selectTop20() {
        return teamMapper.selectTop20();
    }

    @Override
    public List<Team> matchRecommend() {
        return teamMapper.matchRecommend();
    }
}
