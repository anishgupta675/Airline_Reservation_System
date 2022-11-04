package com.example.AirlineReservationSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AirlineReservationSystem.model.Flight;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
