package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Booking extends BaseModel{

    @ManyToOne
    private User user;

    @OneToMany
    private List<ShowSeat> showSeats;

    @ManyToOne
    private Show show;
    private int amount;

    @OneToMany
    private List<Payment> payments;
    private BookingStatus bookingStatus;
}
