package com.product.productList.controller;

import com.oracle.simpleInterest.exception.InterestException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ErrorHandler {
    @ExceptionHandler(InterestException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public InterestException handlerException(InterestException interestException) {
        return interestException;
    }
}
