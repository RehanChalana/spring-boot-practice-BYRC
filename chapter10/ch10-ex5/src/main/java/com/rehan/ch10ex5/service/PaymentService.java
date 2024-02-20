package com.rehan.ch10ex5.service;

import com.rehan.ch10ex5.exceptions.NotEnoughMoneyException;
import com.rehan.ch10ex5.model.PaymentDetails;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {
    public PaymentDetails processPayment() {
        throw new NotEnoughMoneyException();
    }
}
