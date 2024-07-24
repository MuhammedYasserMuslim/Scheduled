package com.spring.exception.exceptions;

import org.springframework.http.HttpStatus;

public class InvalidTypeException extends BaseException {

    public InvalidTypeException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.BAD_REQUEST;
    }
}
