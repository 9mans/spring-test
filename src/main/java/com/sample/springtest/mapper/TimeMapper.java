package com.sample.springtest.mapper;

import org.apache.ibatis.annotations.Select;

public interface TimeMapper {
    @Select("select now()")
    String getTime();
}
