package com.example.model;

import lombok.Data;

import java.util.Date;

@Data
public class Teacher extends AbstractClass {

    private String name ;
    private String surname;
    private String adress;
    private Date dob;
    private String phone;
}
