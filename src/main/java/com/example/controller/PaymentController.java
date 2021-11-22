package com.example.controller;

import com.example.model.Payment;
import com.example.service.impl.PaymentServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

@RestController
@RequestMapping(value = "/payment")
public class PaymentController {

    @Autowired
    private PaymentServiceImpl paymentService;


    @GetMapping(value = "/getPaymentList")
    public ModelAndView getPaymentList(){

        ModelAndView model = new ModelAndView("/paymentList");
        try {
            List<Payment> paymentList = paymentService.getPaymentList();
            model.addObject("paymentList",paymentList);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return model;
    }
}
