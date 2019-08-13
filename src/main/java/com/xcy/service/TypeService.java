package com.xcy.service;

import com.xcy.pojo.Type;

import java.util.List;

public interface TypeService {
    List<Type> selectAllType();

    List<Type> likeSelect(String name);

    String getUrl(int id);
}
