package com.example.demo.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class GreetingsController {
    @RequestMapping(value = "/greeting", method = RequestMethod.GET)
    public String IntoGet() {
        return "greeting";
    }
}
