package com.xcy.mapper;

import com.xcy.pojo.User;

public interface UserMapper {
    int selectUser(User user);

    int validateLogin(User user);
}
