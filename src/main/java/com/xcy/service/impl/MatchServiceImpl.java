package com.xcy.service.impl;

import com.xcy.mapper.MatchMapper;
import com.xcy.pojo.Match;
import com.xcy.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MatchServiceImpl implements MatchService {

    @Autowired
    MatchMapper matchMapper;

    @Override
    public Match getMatchDetail(int id) {
        return matchMapper.getMatchDetail(id);
    }
}
