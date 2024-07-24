package com.spring.exception;

import lombok.Getter;
import lombok.Setter;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

@Setter
@Getter
public class ExceptionResponse {

    private LocalDateTime timestamp;
    private HttpStatus status;
    private String message;

    public ExceptionResponse(HttpStatus status, String message) {
        this.timestamp = LocalDateTime.now();
        this.status = status;
        this.message = message;
    }

}
