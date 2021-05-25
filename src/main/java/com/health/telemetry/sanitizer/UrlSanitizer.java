package com.health.telemetry.sanitizer;

import lombok.NonNull;

public class UrlSanitizer implements Sanitizer<String>{

    public static final String URL_REGEX = "^(((([A-Za-z]{3,9}:(?:\\/\\/)?)(?:[-;:&=\\+\\$,\\w]+@)?[A-Za-z0-9.-]+|(?:www." +
            "|[-;:&=\\+\\$,\\w]+@)[A-Za-z0-9.-]+)((?:\\/[\\+~%\\/.\\w-_]*)?\\??(?:[-\\+=&;%@.\\w_]*)#?(?:[\\w]*))?))";

    @Override
    @NonNull
    public String sanitize(@NonNull String url) {
        return url.replaceAll(URL_REGEX, "");
    }
}
