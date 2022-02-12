package com.yablokovs.service;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FacadeTest {

    @Autowired
    Facade facade;

    @Test
    public void test () {

        String s = facade.callResult();
        System.out.println();

        Assertions.assertEquals(s, "result");

    }
}