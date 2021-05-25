package com.health.telemetry.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Date;

@AllArgsConstructor
@Builder
@Data
public class Registrations {

    @Id
    private final Long id;

    private final String url;

    private final Date registrationTimestamp;

    private final String alias;


}
