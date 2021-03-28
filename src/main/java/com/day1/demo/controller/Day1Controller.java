package com.day1.demo.controller;

import com.day1.demo.services.Day1Service;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@Slf4j
public class Day1Controller {

    final Day1Service day1service;

    public Day1Controller(Day1Service day1service) {
        this.day1service = day1service;
    }

    @GetMapping("/name")
    public String name(String inputName, int inputAge){
        log.debug("[Controller:name()] inputName:{}, inputAge:{}",inputName,inputAge);
        return day1service.returnName(inputName,inputAge);
    }

    @GetMapping("/totalAge")
    public String totalAge(){
        return day1service.totalAge();
    }
}
