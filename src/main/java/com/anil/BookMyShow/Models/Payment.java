package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Payment extends BaseModel{

    private int amount;
    private PaymentMode paymentMode;
    private PaymentStatus paymentStatus;
    private String referenceNumber  ;
}
