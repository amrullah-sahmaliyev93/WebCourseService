package com.example.dao.impl;

import com.example.dao.LessonDao;
import com.example.model.Lesson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class LessonDaoImpl  implements LessonDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Lesson> getLessonList() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM LESSON";
       List<Lesson> lessonList =  jdbcTemplate.query(sql,new BeanPropertyRowMapper(Lesson.class));
        return lessonList;
    }
}
