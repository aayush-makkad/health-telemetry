package com.health.telemetry.controller;

import com.health.telemetry.entities.Registrations;
import com.health.telemetry.exceptions.UrlAlreadyExistException;
import com.health.telemetry.model.RegistryRequestModel;
import com.health.telemetry.model.RegistryResponseModel;
import com.health.telemetry.service.RegistryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@AllArgsConstructor
public class RegistryController {

    private final RegistryService registryService;

    @PostMapping("/register")
    public RegistryResponseModel registerService(@RequestBody RegistryRequestModel request)
            throws UrlAlreadyExistException {
        RegistryRequestModel sanitizedRequest = request.sanitize();
        Registrations register = registryService.register(sanitizedRequest.getUrl(), sanitizedRequest.getAlias());
        return new RegistryResponseModel(register.getId(),
                register.getUrl(), register.getAlias(), register.getRegistrationTimestamp());
    }

}
