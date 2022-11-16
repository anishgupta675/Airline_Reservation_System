package com.example.AirlineReservationSystem.dto;

import com.example.AirlineReservationSystem.model.Invoice;
import lombok.Data;

import java.sql.Timestamp;
import java.util.UUID;

@Data
public class InvoiceDTO {
    private final UUID id;
    private final String status;
    private final Timestamp createdDate;
    private final boolean isDeleted;

    public static InvoiceDTO fromModel(Invoice invoice) {
        return new InvoiceDTO(
                invoice.getId(),
                invoice.getStatus(),
                invoice.getCreatedDate(),
                invoice.isDeleted()
        );
    }
}
