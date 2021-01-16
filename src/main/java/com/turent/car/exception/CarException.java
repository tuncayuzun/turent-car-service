package com.turent.car.exception;

import lombok.Getter;
import org.springframework.http.HttpStatus;

import java.io.Serializable;

@Getter
public class CarException extends RuntimeException implements Serializable {
    private static final long serialVersionUID = 1L;
    private final HttpStatus httpStatus;
    private final String errorCode;
    private final String detail;

    public CarException(HttpStatus httpStatus, String message, String... parameters) {
        super(message);
        this.httpStatus = httpStatus;
        this.errorCode = parameters.length > 0 ? parameters[0] : "CAR ERROR";
        this.detail=parameters.length > 1 ? parameters[1] : "An Car exception error occurred!";
    }
}
