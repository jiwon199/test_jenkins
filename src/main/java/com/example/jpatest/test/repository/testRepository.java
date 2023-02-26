package com.example.jpatest.test.repository;

import com.example.jpatest.test.dto.test;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface testRepository extends JpaRepository<test, Long> {
    //커스텀 쿼리 메서드
    List<test> findByNameContaining(String name);
}
