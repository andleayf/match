package com.xcy.mapper;

import com.xcy.pojo.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {
    int selectUser(User user);

    int validateLogin(User user);

    int insertUser(User user);
}
