package com.example.service.impl;

import com.example.dao.StudentDao;
import com.example.model.Student;
import com.example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;


    @Override
    public List<Student> getStudentList() throws Exception {

        return studentDao.getStudentList();
    }
}
