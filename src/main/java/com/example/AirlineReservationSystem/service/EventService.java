package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.model.Event;

public interface EventService {
    public Iterable<Event> findByName(String name);
}
