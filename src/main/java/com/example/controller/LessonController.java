package com.example.controller;

import com.example.model.Lesson;
import com.example.service.impl.LessonServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/lesson")
public class LessonController {


    @Autowired
    private LessonServiceImpl lessonService;

    @GetMapping (value = "/getLessonList")
    public ModelAndView getLessonList(){
        ModelAndView model = new ModelAndView("/getLessonList");
        try {
            List<Lesson> lessonList = lessonService.getLessonList();
            model.addObject("lessonList",lessonList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }

}
