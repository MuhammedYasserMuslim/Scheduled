package com.spring.exception.exceptions;


import org.springframework.http.HttpStatus;

public class RecordNotFoundException extends BaseException {


    public RecordNotFoundException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatus() {
        return HttpStatus.NOT_FOUND;
    }
}
