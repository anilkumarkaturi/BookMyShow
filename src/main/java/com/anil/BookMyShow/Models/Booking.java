package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{

    private User user;
    private List<ShowSeat> showSetas;
    private Show show;
    private int amount;
    private List<Payment> payments;
    private BookingStatus bookingStatus;
}
