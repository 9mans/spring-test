package com.sample.springtest.mapper;


import com.sample.springtest.domain.TodoVO;
import com.sample.springtest.dto.PageRequestDTO;

import java.util.List;

public interface TodoMapper {

    List<TodoVO> selectList(PageRequestDTO pageRequestDTO);
    int getCount(PageRequestDTO pageRequestDTO);


    String getTime();

    void insert(TodoVO todoVO);

    List<TodoVO> selectAll();

    TodoVO selectOne(Long tno);

    void delete(Long tno);

    void update(TodoVO todoVO);
}
