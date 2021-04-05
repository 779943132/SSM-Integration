package com.test.dao;

import org.apache.ibatis.annotations.Param;

public interface 这里写实体类的Mapper接口 {
    //这里写要实现的方法 数据库的GRUP
    //这里使用一个update方法举例
    int update(@Param("参数") String 参数);
}
