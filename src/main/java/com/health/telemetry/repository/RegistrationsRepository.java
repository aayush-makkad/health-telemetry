package com.health.telemetry.repository;

import com.health.telemetry.entities.Registrations;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegistrationsRepository extends CrudRepository<Registrations, Long> {

    List<Registrations> findByUrl(String url);

}
