package com.rehan.ch10ex6.controllers.advice;

import com.rehan.ch10ex6.exceptions.NotEnoughPaymentException;
import com.rehan.ch10ex6.model.ErrorDetails;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(NotEnoughPaymentException.class)
    public ResponseEntity<ErrorDetails> exceptionNotEnoughMoneyHandler() {
        ErrorDetails errorDetails = new ErrorDetails();
        errorDetails.setMessage("Not enough money to process the payment");
        return ResponseEntity
                .badRequest()
                .body(errorDetails);
    }
}
