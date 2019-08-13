package com.xcy.repository;

import com.xcy.pojo.Team;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TeamMapper {
    List<Team> selectTop20();

    List<Team> matchRecommend();
}
