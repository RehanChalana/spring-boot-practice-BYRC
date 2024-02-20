package com.rehan.ch10ex6.service;

import com.rehan.ch10ex6.exceptions.NotEnoughPaymentException;
import com.rehan.ch10ex6.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughPaymentException();
    }
}
