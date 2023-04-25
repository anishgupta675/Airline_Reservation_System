package com.fsp.airlinereservationsystem.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.UUID;

import static jakarta.persistence.GenerationType.IDENTITY;

@Data
@AllArgsConstructor
@Entity
public class Airplane {

    @Id
    @GeneratedValue(strategy = IDENTITY)
    private final UUID id;
    @NotBlank
    private final Long numberOfSeats;
    private final String seatName;
}
