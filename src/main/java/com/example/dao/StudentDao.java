package com.example.dao;

import com.example.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> getStudentList()throws Exception;
}
