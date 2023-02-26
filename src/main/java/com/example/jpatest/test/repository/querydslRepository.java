package com.example.jpatest.test.repository;

import com.example.jpatest.test.dto.test;

import java.util.List;

public interface querydslRepository {
    List<test> getList();
}
