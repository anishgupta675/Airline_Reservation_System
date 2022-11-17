package com.example.AirlineReservationSystem.controller;

import com.example.AirlineReservationSystem.model.Flight;
import com.example.AirlineReservationSystem.repository.CustomerRepository;
import com.example.AirlineReservationSystem.repository.FlightRepository;
import com.example.AirlineReservationSystem.repository.TicketRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;
import java.util.List;
import java.util.UUID;

@Controller
public class ReservationController {

    TicketRepository ticketRepository;
    CustomerRepository customerRepository;
    FlightRepository flightRepository;

    @Autowired
    public ReservationController(TicketRepository ticketRepository, CustomerRepository customerRepository) {
        this.ticketRepository = ticketRepository;
        this.customerRepository = customerRepository;
    }

    @GetMapping("/flights/{flightId}/reservation")
    public String reservationPage(Model model, @PathVariable ("flightId") Collection<UUID> flightId) {
        List<Flight<Collection<E>>> flights = flightRepository.findFlightByInformation(flightId);

        model.addAttribute("flights", flights);
        return "reservation";
    }
}
