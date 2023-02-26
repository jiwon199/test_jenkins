package com.example.jpatest.test.service;

import com.example.jpatest.test.dto.test;

import java.util.List;

public interface testService {
    long getCount();
    List<test> getCustom(String name);
    List <test> getQueryDsl();
}
