package com.oracle.simpleInterest.exception;

public class InterestException extends RuntimeException {
    public InterestException(String message) {
        super(message);
    }

    @Override
    public synchronized Throwable fillInStackTrace() {
        return this;
    }
}
