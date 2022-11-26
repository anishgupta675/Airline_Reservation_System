package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.model.Customer;
import com.example.AirlineReservationSystem.repository.CustomerRepository;
import lombok.AllArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.Collections;
import java.util.Optional;
import java.util.UUID;

@Service
@AllArgsConstructor
public class CustomerDetailsServiceImpl implements UserDetailsService {
    private CustomerRepository customerRepository;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String firstName) {
        Optional<Customer> customerOptional = customerRepository.findById(UUID.randomUUID());
        Customer customer = customerOptional.orElseThrow(() -> new UsernameNotFoundException("No customer " + "Found with first name : " + firstName));
        return new org.springframework.security.core.userdetails.User(customer.getFirstName(), customer.getPassword(), customer.isAdmin(), true, true, true, getAuthorities("CUSTOMER"));
    }

    private Collection<? extends GrantedAuthority> getAuthorities(String role) {
        return Collections.singletonList(new SimpleGrantedAuthority(role));
    }
}
