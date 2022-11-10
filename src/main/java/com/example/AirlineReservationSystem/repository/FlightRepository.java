package com.example.AirlineReservationSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AirlineReservationSystem.model.Flight;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface FlightRepository extends JpaRepository<Flight, UUID> {
    List<Flight> findFlightByInformation(Collection<UUID> flightId, String extension);

    List<Flight> priceComparator(Collection<UUID> flightId, String extension);
}
