package com.example.AirlineReservationSystem.controller;

import com.example.AirlineReservationSystem.controller.FlightSearchFormData;
import com.example.AirlineReservationSystem.model.Flight;
import com.example.AirlineReservationSystem.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class FlightController {

    @Autowired
    private FlightService service;

    @GetMapping("/")
    public String add(Model model) {
        model.addAttribute("flightSearchFormData", new FlightSearchFormData());
        return "index";
    }

    @PostMapping("/search")
    public String doSearchFlight(@ModelAttribute("flightSearchFormData") FlightSearchFormData formData, Model model) {
        Flight flight = service.get(formData.getFlightId());
        model.addAttribute("flight", flight);
        return "index";
    }
}
