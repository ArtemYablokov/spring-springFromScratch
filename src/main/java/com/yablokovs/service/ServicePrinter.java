package com.yablokovs.service;


import org.springframework.stereotype.Service;

@Service
public class ServicePrinter {

    private final String result = "result";

    public String printResult() {
        System.out.println(result);
        return result;
    }
}
