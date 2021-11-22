package com.example.service;

import com.example.model.Lesson;

import java.util.List;

public interface LessonService {

    List<Lesson> getLessonList()throws Exception;
}
