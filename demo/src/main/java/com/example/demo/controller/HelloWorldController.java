package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HelloWorldController {
    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public String IntoGet() {
        return "index";
    }
}
