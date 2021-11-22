package com.example.model;

import lombok.Data;

@Data
public class Payment extends AbstractClass {
    private Student student;
    private Teacher teacher;
    private Lesson lesson;
    private Float amount;
}
