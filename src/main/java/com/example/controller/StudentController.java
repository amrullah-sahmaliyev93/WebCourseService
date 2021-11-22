package com.example.controller;

import com.example.model.Student;
import com.example.service.impl.StudentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/student")
public class StudentController {
  @Autowired
  private StudentServiceImpl studentService;

    @GetMapping(value = "/getStudent")
    public ModelAndView getStudentList(){
        ModelAndView model = new ModelAndView("/getStudentList");
        try {
            List<Student> studentList = studentService.getStudentList();
            model.addObject("studentList",studentList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
}
