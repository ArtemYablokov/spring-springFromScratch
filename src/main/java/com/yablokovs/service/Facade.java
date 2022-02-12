package com.yablokovs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public abstract class Facade {

    @Autowired
    ServicePrinter servicePrinter;

    public String callResult() {
        return servicePrinter.printResult() + addResult();
    }

    protected abstract String addResult();
}
