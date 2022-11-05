package com.example.AirlineReservationSystem.repository;

import com.example.AirlineReservationSystem.model.Event;
import org.springframework.data.repository.CrudRepository;

import java.util.UUID;

public interface EventRepository extends CrudRepository<Event, UUID> {
    public Iterable<Event> findByName(String name);
}
