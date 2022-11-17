package com.example.AirlineReservationSystem.repository;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.AirlineReservationSystem.model.Flight;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Repository
public interface FlightRepository extends JpaRepository<Flight<Collection<E>>, UUID> {
    List<Flight<Collection<E>>> findFlightByInformation(Collection<UUID> flightId);

    List<Flight<Collection<E>>> priceComparator(Collection<UUID> flightId);
}
