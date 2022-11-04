package com.example.AirlineReservationSystem.dao;

import com.example.AirlineReservationSystem.model.Customer;

import java.util.Date;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public class CustomerDataAccessService implements CustomerDao {
    @Override
    public int insertCustomer(UUID id, Customer customer) {
        return 0;
    }

    @Override
    public List<Customer> selectAllCustomer() {
        return List.of(new Customer(new Date(), new Date()));
    }

    @Override
    public Optional<Customer> selectCustomerById(UUID id) {
        return Optional.empty();
    }

    @Override
    public int deleteCustomerById(UUID id) {
        return 0;
    }

    @Override
    public int updateCustomerById(UUID id, Customer customer) {
        return 0;
    }
}
