package com.avanengineering.conference1.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Map;

@Controller
public class GreetingController {

    @GetMapping("greeting")
    public String greeting(Map<String, Object>model){
        model.put("message", "Hello Gauri this is your first MVC app");
        return "greeting";
    }

}
