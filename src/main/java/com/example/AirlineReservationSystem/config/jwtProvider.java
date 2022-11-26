package com.example.AirlineReservationSystem.config;

import com.example.AirlineReservationSystem.model.Customer;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Service;

@Service
public class jwtProvider {

    public String generateToken(Authentication authentication) {
        Customer principal = (Customer) authentication.getPrincipal();
        return "";
    }
}
