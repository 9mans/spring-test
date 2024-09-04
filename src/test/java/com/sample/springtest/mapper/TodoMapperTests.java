package com.sample.springtest.mapper;

import com.sample.springtest.domain.TodoVO;
import lombok.extern.log4j.Log4j2;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.time.LocalDate;
import java.util.List;

@Log4j2
@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/root-context.xml")
public class TodoMapperTests {

    @Autowired(required = false)
    private TodoMapper todoMapper;

    @Test
    public void testGetTime() {
        log.info(todoMapper.getTime());
    }

    @Test
    public void testInsert() {

        TodoVO todoVO = TodoVO.builder()
                .title("스프링테스트")
                .dueDate(LocalDate.of(2024,10,10))
                .writer("저자")
                .build();

        todoMapper.insert(todoVO);
    }

    @Test
    public void testSelectAll() {

        List<TodoVO> list = todoMapper.selectAll();

        list.forEach(vo -> log.info(vo));
    }

    @Test
    public void testSelectOne() {

        TodoVO todoVO = todoMapper.selectOne(3L);
    }
}
