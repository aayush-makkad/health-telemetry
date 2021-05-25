package com.health.telemetry.model;

import com.health.telemetry.sanitizer.Sanitizer;
import com.health.telemetry.sanitizer.UrlSanitizer;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Objects;


@AllArgsConstructor
@Getter
public class RegistryRequestModel implements Request{

    private final String url;

    private final String alias;

    public RegistryRequestModel sanitize() {
        Sanitizer<String> sanitizer = new UrlSanitizer();
        String sanitizedUrl = sanitizer.sanitize(this.url);
        String sanitizedAlias = null;
        if(Objects.nonNull(this.alias)) {
            sanitizedAlias = sanitizer.sanitize(this.alias);
        }
        return new RegistryRequestModel(sanitizedUrl, sanitizedAlias);
    }

}
