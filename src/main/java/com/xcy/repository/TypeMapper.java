package com.xcy.repository;

import com.xcy.pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
public interface TypeMapper {
    List<Type> selectAllType();

    List<Type> likeSelect(String name);

    String getUrl(int id);
}
