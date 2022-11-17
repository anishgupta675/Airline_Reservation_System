package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.model.Flight;
import com.example.AirlineReservationSystem.repository.FlightRepository;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.UUID;

@Service
public class FlightServiceImpl implements FlightService {
    private final FlightRepository repository;

    public FlightServiceImpl(FlightRepository repository) { this.repository = repository; }
    public Flight<Collection<E>> get(UUID flightId) { return new Flight<Collection<E>>(); }
}
