package com.example.service.impl;

import com.example.dao.TeacherDao;
import com.example.dao.impl.TeacherDaoImpl;
import com.example.model.Teacher;
import com.example.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    private TeacherDaoImpl teacherDao;
    @Override
    public List<Teacher> getTeacherList() throws Exception {
        return teacherDao.getTeacherList();
    }
}
