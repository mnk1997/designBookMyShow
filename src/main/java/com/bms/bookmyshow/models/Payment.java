package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class Payment extends BaseModel{

    double amount;
   Ticket ticketId;
    PaymentStatus paymentStatus;
    String paymentReference;

}
