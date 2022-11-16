package com.example.AirlineReservationSystem.model;

import lombok.Data;
import net.minidev.json.annotate.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.UUID;

@Data
public class Invoice {

    private UUID id;
    private long serialNumber;
    private String status;
    private Timestamp createdDate;
    private boolean isDeleted;
    @JsonIgnore
    private Customer customer;
}
