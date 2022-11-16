package com.example.AirlineReservationSystem.controller;

import com.example.AirlineReservationSystem.dto.CustomersEntityDTO;
import com.example.AirlineReservationSystem.model.Customer;
import com.example.AirlineReservationSystem.service.CustomerService;
import lombok.NonNull;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RequestMapping("api/v1/person")
@RestController
public class CustomerController {

    private final CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @PostMapping
    public void addCustomer(@Valid @NonNull @RequestBody Customer customer) {
        customerService.addCustomer(customer);
    }

    @GetMapping
    public List<Customer> getAllCustomer() {
        return customerService.getAllCustomer();
    }

    @GetMapping("/viewList")
    public ResponseEntity<List<CustomersEntityDTO>> getAllCustomers() {
        List<CustomersEntityDTO> customers = new ArrayList<>();
        customers = customerService.getAllCustomer()
                .stream()
                .map(CustomersEntityDTO::fromModel)
                .toList();
        if(customers.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(customers, HttpStatus.OK);
    }

    public Customer getCustomerById(UUID id) {
        return customerService.getCustomerById(id)
                .orElse(null);
    }

    @DeleteMapping(path = "{id}")
    public void deleteCustomerById(@PathVariable("id") UUID id) {
        customerService.deleteCustomer(id);
    }

    @PutMapping(path = "{id}")
    public void updateCustomer(@PathVariable("id") UUID id, @Valid @NonNull @RequestBody Customer customerToUpdate) {
        customerService.updateCustomer(id, customerToUpdate);
    }
}
