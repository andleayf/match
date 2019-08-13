package com.xcy.service;

import com.xcy.pojo.News;
import com.xcy.pojo.Player;

import java.util.List;

public interface NewService {
    List<Player> selectHeadNew(News news);

    List<Player> selectMoreNew();
}
