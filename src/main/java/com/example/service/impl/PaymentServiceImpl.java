package com.example.service.impl;

import com.example.dao.impl.PaymentDaoImpl;
import com.example.model.Payment;
import com.example.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentServiceImpl implements PaymentService {

    @Autowired
    private PaymentDaoImpl paymentDao;

    @Override
    public List<Payment> getPaymentList() throws Exception {

        return paymentDao.getPaymentList();
    }
}
