package com.sample.springtest.ex;

import lombok.RequiredArgsConstructor;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@ToString
@Service
@RequiredArgsConstructor
public class ExService {

    private final ExDAO exDAO;

    /* @RequiredArgsConstructor를 사용하지 않을 때(생성자 주입방식을 도와주는 어노테이션)
    @Autowired
    public ExService(ExDAO exDAO) {
        this.exDAO = exDAO;
    }
     */



}
