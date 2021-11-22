package com.example.model;

import lombok.Data;

@Data
public class Lesson  extends  AbstractClass{
    private String lessonName;
    private Float lessonPrice;
    private Integer lessonTime;
}
