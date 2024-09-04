package com.sample.springtest.service;


import com.sample.springtest.domain.TodoVO;
import com.sample.springtest.dto.TodoDTO;

import java.util.List;

public interface TodoService {

    void register(TodoDTO todoDTO);

    List<TodoDTO> getAll();

    TodoDTO getOne(Long tno);
}
