package com.a133beta.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    @GetMapping({"/","/login"})
    public String index() {
        return "index";
    }

    @GetMapping("/menu")
    public String hello() {
        return "menu";
    }

    @GetMapping("/system")
    public String system() {
        return "system";
    }

    @GetMapping("/userman")
    public String userman() {
        return "userman";
    }
}