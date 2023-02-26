package com.example.jpatest.test.repository;

import com.example.jpatest.test.dto.Qtest;
import com.example.jpatest.test.dto.test;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;
@RequiredArgsConstructor
@Repository
public class querydslRepostoryImpl implements querydslRepository {


    private final JPAQueryFactory jpaQueryFactory;

    @Override
    public List<test> getList() {
        Qtest qtest = Qtest.test;
        return jpaQueryFactory
                .selectFrom(qtest)
                .fetch();

    }
}
