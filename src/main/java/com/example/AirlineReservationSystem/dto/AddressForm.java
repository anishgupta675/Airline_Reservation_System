package com.example.AirlineReservationSystem.dto;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class AddressForm implements Serializable {
    private static final UUID serialVersionUID = UUID.randomUUID();

    @NotNull
    UUID id;

    @Override
    public UUID getId() {
        return id;
    }

    @Override
    public void setId(UUID id) {
        this.id = id;
    }
}
