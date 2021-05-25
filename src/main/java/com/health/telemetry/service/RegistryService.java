package com.health.telemetry.service;

import com.health.telemetry.entities.Registrations;
import com.health.telemetry.exceptions.UrlAlreadyExistException;
import com.health.telemetry.repository.RegistrationsRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@AllArgsConstructor
@Slf4j
public class RegistryService {

    public static final String CANNOT_REGISTER_THIS_URL = "Cannot register this url";
    private final RegistrationsRepository registrationsRepository;

    public Registrations register(String url, String alias) throws UrlAlreadyExistException {
        List<Registrations> registeredEntryWithSameUrl = registrationsRepository.findByUrl(url);
        if(Objects.nonNull(registeredEntryWithSameUrl) && !registeredEntryWithSameUrl.isEmpty()) {
            log.error(CANNOT_REGISTER_THIS_URL);
            throw new UrlAlreadyExistException(CANNOT_REGISTER_THIS_URL);
        }
        Registrations registrationsObject = Registrations.builder().url(url)
                .alias(alias).build();
        Registrations savedEntry = registrationsRepository.save(registrationsObject);
        return savedEntry;
    }

}
