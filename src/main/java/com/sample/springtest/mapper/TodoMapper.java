package com.sample.springtest.mapper;


import com.sample.springtest.domain.TodoVO;

public interface TodoMapper {

    String getTime();

    void insert(TodoVO todoVO);
}
