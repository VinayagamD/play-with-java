package com.vinaylogics.playwithjava.springbootlearn.springjsp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HelloController {

    @GetMapping("/index")
    public String index(){
        return "welcome";
    }
}
