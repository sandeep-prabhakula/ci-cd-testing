package com.sandeepprabhakula.ci_cd_testing.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @GetMapping
    public String getHello(){
        return "Helo world";
    }
}
