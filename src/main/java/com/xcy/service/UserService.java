package com.xcy.service;

import com.xcy.pojo.User;

public interface UserService {

    boolean userLogin(User user);

    boolean selectUser(User user);

    int insertUser(User user);
}
