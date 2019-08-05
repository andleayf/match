package com.xcy.service.Impl;

import com.xcy.mapper.UserMapper;
import com.xcy.pojo.User;
import com.xcy.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean userLogin(User user) {
        int result=userMapper.validateLogin(user);
        return result >0 ? true:false;
    }

    public boolean selectUser(User user) {
        int count =userMapper.selectUser(user);
        return count >0 ? true:false;
    }
}
