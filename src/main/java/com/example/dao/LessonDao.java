package com.example.dao;

import com.example.model.Lesson;

import java.util.List;

public interface LessonDao {

    List<Lesson> getLessonList()throws  Exception;
}
