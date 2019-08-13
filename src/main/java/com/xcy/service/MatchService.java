package com.xcy.service;

import com.xcy.pojo.Match;
import org.springframework.stereotype.Service;

@Service
public interface MatchService {
    Match getMatchDetail(int id);
}
