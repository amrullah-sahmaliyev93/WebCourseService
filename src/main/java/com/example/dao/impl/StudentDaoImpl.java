package com.example.dao.impl;

import com.example.dao.StudentDao;
import com.example.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

  @Autowired
  private DataSource dataSource;

    @Override
    public List<Student> getStudentList() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT * FROM STUDENT";
        List<Student> studentList = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Student.class));
        return studentList;
    }
}
