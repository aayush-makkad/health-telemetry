package com.health.telemetry.sanitizer;

public interface Sanitizer<T> {
    T sanitize(T object);
}
