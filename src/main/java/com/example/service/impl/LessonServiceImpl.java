package com.example.service.impl;

import com.example.dao.impl.LessonDaoImpl;
import com.example.model.Lesson;
import com.example.service.LessonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class LessonServiceImpl implements LessonService {

    @Autowired
    private LessonDaoImpl lessonDao;

    @Override
    public List<Lesson> getLessonList() throws Exception {
        return lessonDao.getLessonList();
    }
}
