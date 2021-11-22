package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(value = "/index")
public class MainController {

    @GetMapping(value = {"/main"})
    public ModelAndView login(){
        ModelAndView modelAndView = new ModelAndView("/index");

        return modelAndView;
    }

}
