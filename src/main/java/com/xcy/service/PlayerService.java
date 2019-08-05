package com.xcy.service;

import com.xcy.pojo.Match;
import com.xcy.pojo.Player;

import java.util.List;

public interface PlayerService {
    List<Player> selectTop10Player();

    List<Player> selectTop10Teamr();

    List<Player> selectTop5Match(Match detailsId);
}
