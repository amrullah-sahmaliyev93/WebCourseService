package com.example.dao.impl;

import com.example.dao.TeacherDao;
import com.example.model.Teacher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
@Repository
public class TeacherDaoImpl implements TeacherDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Teacher> getTeacherList() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql  = "SELECT * FROM TEACHER";
       List<Teacher> teacherList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(Teacher.class));
        return teacherList;
    }
}
