package com.xcy.service.impl;

import com.xcy.pojo.Type;
import com.xcy.repository.TypeMapper;
import com.xcy.service.TypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    @Autowired
    TypeMapper typeMapper;
    @Override
    public List<Type> selectAllType() {
        return typeMapper.selectAllType();
    }

    @Override
    public List<Type> likeSelect(String name) {
        return typeMapper.likeSelect(name);
    }

    @Override
    public String getUrl(int id) {
        return typeMapper.getUrl(id);
    }
}
