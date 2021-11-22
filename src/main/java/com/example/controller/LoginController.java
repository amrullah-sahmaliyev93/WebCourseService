package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class LoginController {




    @GetMapping(value = {"/" , "/login"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/login");

        return modelAndView;
    }
}
