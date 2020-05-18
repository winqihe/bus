package com.busdata.bus.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BusRepositoryTest {
    @Autowired
    private BusRepository busRepository;
    @Test

    void findAll(){
        System.out.println(busRepository.findAll());
    }
}