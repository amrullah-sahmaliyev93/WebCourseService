package com.example.controller;

import com.example.model.Teacher;
import com.example.service.impl.TeacherServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/teacher")
public class TeacherController {


    @Autowired
    private TeacherServiceImpl teacherService;

    @GetMapping(value = "/getTeacher")
    public ModelAndView getHello(){
        ModelAndView modelAndView = new ModelAndView("/getTeacherList");
        try {
            List<Teacher> teacherList = teacherService.getTeacherList();
            modelAndView.addObject("teacherList",teacherList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return modelAndView;
    }




}
