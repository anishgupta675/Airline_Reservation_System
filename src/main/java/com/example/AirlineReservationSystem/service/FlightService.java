package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.model.Flight;

import java.util.UUID;

public interface FlightService {
    Flight get(UUID flightId);
}
