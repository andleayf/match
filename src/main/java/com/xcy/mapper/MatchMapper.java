package com.xcy.mapper;

import com.xcy.pojo.Match;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MatchMapper {
    Match getMatchDetail(int id);
}
