package com.test.service;

import com.test.dao.这里写实体类的Mapper接口;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service//使用注解将这个类注册到spring容器
public class service接口的实现 implements service接口{
    @Autowired//使用自动注册将其注册过来
    private 这里写实体类的Mapper接口 这里写实体类的Mapper接口;
    @Override
    public int update(String 参数) {
        return 这里写实体类的Mapper接口.update("参数");
    }
}
