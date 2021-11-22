package com.example.dao;

import com.example.model.Payment;

import java.util.List;

public interface PaymentDao {
    List<Payment> getPaymentList ()throws  Exception;
}
