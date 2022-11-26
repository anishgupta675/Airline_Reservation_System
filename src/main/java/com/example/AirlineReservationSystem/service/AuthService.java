package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.dto.LoginRequest;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

public class AuthService {

    private AuthenticationManager authenticationManager;

    public void login(LoginRequest loginRequest) {
        authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(loginRequest.getFirstName(), loginRequest.getPassword()));
    }
}
