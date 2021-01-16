package com.turent.car.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import java.time.LocalDateTime;

@RestControllerAdvice
public class CarExceptionHandler {

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<CarError> handleDefaultException(final HttpServletRequest httpServletRequest, final RuntimeException runtimeException) {
        CarError carError = new CarError();
        carError.setStatus(HttpStatus.INTERNAL_SERVER_ERROR);
        carError.setErrorCode(runtimeException.getMessage());
        carError.setDetail("An default car exception occurred!");
        carError.setLocalDateTime(LocalDateTime.now());
        carError.setUriRequested(httpServletRequest.getRequestURI());
        return new ResponseEntity<>(carError, carError.getStatus());
    }

    @ExceptionHandler(RuntimeException.class)
    public ResponseEntity<CarError> handleCustomException(final HttpServletRequest httpServletRequest, final CarException carException) {
        CarError carError = new CarError();
        carError.setStatus(carException.getHttpStatus());
        carError.setErrorCode(carException.getErrorCode());
        carError.setDetail(carException.getDetail());
        carError.setLocalDateTime(LocalDateTime.now());
        carError.setUriRequested(httpServletRequest.getRequestURI());
        return new ResponseEntity<>(carError, carError.getStatus());
    }
}
