package com.health.telemetry.model;


import lombok.AllArgsConstructor;

import java.util.Date;

@AllArgsConstructor
public class RegistryResponseModel {

    private final Long id;
    private final String url;
    private final String alias;
    private final Date timestamp;

}
