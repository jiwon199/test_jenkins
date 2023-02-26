package com.example.jpatest.test.service;

import com.example.jpatest.test.dto.test;
import com.example.jpatest.test.repository.querydslRepository;
import com.example.jpatest.test.repository.testRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@RequiredArgsConstructor
public class testServcieImpl implements testService{

    private final testRepository jpaRepo;
    private final querydslRepository queryRepo;
    @Override
    public long getCount() {
        return jpaRepo.count();
    }

    @Override
    public List<test> getCustom(String name) {
        return jpaRepo.findByNameContaining(name);
    }

    @Override
    public List<test> getQueryDsl() {
        return queryRepo.getList();
    }


}
