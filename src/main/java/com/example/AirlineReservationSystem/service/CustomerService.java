package com.example.AirlineReservationSystem.service;

import com.example.AirlineReservationSystem.dao.CustomerDao;
import com.example.AirlineReservationSystem.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class CustomerService {

    private final CustomerDao customerDao;

    @Autowired
    public CustomerService(@Qualifier("postgres") CustomerDao customerDao) {
        this.customerDao = customerDao;
    }

    public int addCustomer(Customer customer) { return customerDao.insertCustomer(customer); }

    public List<Customer> getAllCustomer() {
        return customerDao.selectAllCustomer();
    }

    public Optional<Customer> getCustomerById(UUID id) {
        return customerDao.selectCustomerById(id);
    }

    public void deleteCustomer(UUID id) {
        customerDao.deleteCustomerById(id);
    }

    public void updateCustomer(UUID id, Customer newCustomer) {
        customerDao.updateCustomerById(id, newCustomer);
    }
}
