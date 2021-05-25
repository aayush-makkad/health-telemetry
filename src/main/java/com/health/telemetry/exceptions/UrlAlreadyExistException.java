package com.health.telemetry.exceptions;

import lombok.AllArgsConstructor;

public class UrlAlreadyExistException extends Exception{
    private final String exceptionMessage;

    public UrlAlreadyExistException(String exceptionMessage) {
        super(exceptionMessage);
        this.exceptionMessage = exceptionMessage;
    }
}
