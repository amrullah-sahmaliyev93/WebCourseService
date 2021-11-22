package com.example.dao.impl;

import com.example.dao.PaymentDao;
import com.example.model.Payment;
import com.example.model.Student;
import org.apache.catalina.valves.StuckThreadDetectionValve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import javax.sql.DataSource;
import java.util.List;
@Repository
public class PaymentDaoImpl implements PaymentDao {

    @Autowired
    private DataSource dataSource;

    @Override
    public List<Payment> getPaymentList() throws Exception {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String sql = "SELECT P.ID,S.ID,S.NAME,S.SURNAME,T.ID,T.NAME,T.SURNAME,L.ID,L.LESSON_NAME,L.LESSON_NAME FROM PAYMENT P \n" +
                "INNER JOIN STUDENT S ON P.STUDENT_ID = S.ID\n" +
                "INNER JOIN TEACHER T ON P.TEACHER_ID = T.ID\n" +
                "INNER JOIN LESSON L ON P.LESSON_ID = L.ID WHERE P.ACTIVE =1";

       List<Payment>  paymentList  =jdbcTemplate.query(sql,new BeanPropertyRowMapper<>(Payment.class));
        for (Payment pm: paymentList) {
            Payment payment = new Payment();
            payment.setId(pm.getId());
            payment.setAmount(pm.getAmount());
            Student student = new Student();
            student.setName(pm.getStudent().getName());
            student.setSurname(pm.getStudent().getSurname());
            payment.setStudent(student);
            System.out.println(payment.getStudent().getName()+" "+payment.getStudent().getSurname());
        }
        return paymentList;
    }
}
