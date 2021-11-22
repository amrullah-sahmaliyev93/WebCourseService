package com.example.dao;

import com.example.model.Teacher;

import java.util.List;

public interface TeacherDao {
    List<Teacher> getTeacherList()throws  Exception;

}
