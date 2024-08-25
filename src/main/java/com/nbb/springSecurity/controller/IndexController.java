package com.nbb.springSecurity.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.security.PermitAll;

@RestController
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/index2")
    public String index2() {
        return "index2";
    }

    @PermitAll
    @RequestMapping("/detail")
    public String detail() {
        return "detail";
    }
}
