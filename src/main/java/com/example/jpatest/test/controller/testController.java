package com.example.jpatest.test.controller;

import com.example.jpatest.test.dto.test;
import com.example.jpatest.test.service.testService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/test")
@RequiredArgsConstructor
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class testController {

    private final testService service;

    //api 정상 동작 확인용- hello 문자열을 반환한다.
    @GetMapping("/hello")
    public String Hello(){
        return "hello";
    }

    //jap 기본 쿼리 메서드 확인용 - 테스트 테이블의 칼럼 수를 반환한다.
    @GetMapping("/testDefault")
    public long getCount(){
        return service.getCount();
    }

    //jpa 커스텀 쿼리 메서드 동작 확인용. 이름에 '안녕'을 포함하는 칼럼을 반환한다.
    @GetMapping("/testCustom")
    public List<test> getTest(){
        return service.getCustom("안녕");
    }

    //jpa querydsl 동작 확인용. 모든 칼럼을 반환한다.
    @GetMapping("/testQueryDsl")
    public List <test> getQueryDsl(){
        return service.getQueryDsl();
    }

}
