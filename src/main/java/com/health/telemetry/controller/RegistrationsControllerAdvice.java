package com.health.telemetry.controller;

import com.health.telemetry.exceptions.UrlAlreadyExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;

@ControllerAdvice
public class RegistrationsControllerAdvice {

    public static final String URL_ALREADY_EXISTS = "cannot register this URL," +
            " please verify the logs for more information";

    @ExceptionHandler(value = {UrlAlreadyExistException.class})
    public ResponseEntity<Object> handleRegistrationErrors(RuntimeException ex, WebRequest request) {
        return new ResponseEntity<>(URL_ALREADY_EXISTS, HttpStatus.BAD_REQUEST);
    }

}
