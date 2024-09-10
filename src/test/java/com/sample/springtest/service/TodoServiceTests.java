package com.sample.springtest.service;

import com.sample.springtest.domain.TodoVO;
import com.sample.springtest.dto.PageRequestDTO;
import com.sample.springtest.dto.PageResponseDTO;
import com.sample.springtest.dto.TodoDTO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoServiceTests {

    @Autowired
    private TodoService todoService;

    @Test
    public void testPaging() {
        PageRequestDTO pageRequestDTO = PageRequestDTO.builder()
                .page(1)
                .size(10)
                .build();

        PageResponseDTO<TodoDTO> responseDTO = todoService.getList(pageRequestDTO);

        log.info(responseDTO);

        responseDTO.getDtoList().stream().forEach(todoDTO -> log.info(todoDTO));
    }




    @Test
    public void testRegister() {

        TodoDTO todoDTO = TodoDTO.builder()
                .title("test,,,,")
                .dueDate(LocalDate.now())
                .writer("저자3")
                .build();

        todoService.register(todoDTO);
    }
}

