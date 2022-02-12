package com.yablokovs.service;

import org.springframework.stereotype.Component;

@Component
public class FacadeImpl extends Facade {

    @Override
    public String addResult() {
        return servicePrinter.printResult();
    }
}
