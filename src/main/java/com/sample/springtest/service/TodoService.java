package com.sample.springtest.service;


import com.sample.springtest.domain.TodoVO;
import com.sample.springtest.dto.PageRequestDTO;
import com.sample.springtest.dto.PageResponseDTO;
import com.sample.springtest.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    PageResponseDTO<TodoDTO> getList(PageRequestDTO pageRequestDTO);

    void register(TodoDTO todoDTO);

//    List<TodoDTO> getAll();

    TodoDTO getOne(Long tno);

    void remove(Long tno);

    void modify(TodoDTO todoDTO);
}
