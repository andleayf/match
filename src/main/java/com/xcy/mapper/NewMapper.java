package com.xcy.mapper;

import com.xcy.pojo.Player;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface NewMapper {
    List<Player> selectHeadNew();

    List<Player> selectMoreNew();
}
