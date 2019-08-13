package com.xcy.mapper;

import com.xcy.pojo.Match;
import com.xcy.pojo.Player;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PlayerMapper {
    List<Player> selectTop10Player();

    List<Player> selectTop10Teamr();

    List<Player> selectTop5Match(Match detailsId);
}
