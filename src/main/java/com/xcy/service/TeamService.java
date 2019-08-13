package com.xcy.service;

import com.xcy.pojo.Team;

import java.util.List;

public interface TeamService {
    List<Team> selectTop20();

    List<Team> matchRecommend();
}
