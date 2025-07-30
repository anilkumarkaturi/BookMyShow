package com.anil.BookMyShow.Models;

import jakarta.persistence.*;
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

    @Enumerated(EnumType.ORDINAL) // numeric
    private BookingStatus bookingStatus;

    /*

    here we are storing booking id i.e:1,2,3 etc 1 refers to completed like
    that why cant we store pending,completed because for search optimization,
     space optimization we are using id suppose in future if we want to
     change to completed to successful instead of iterating all the table we
     can change enum value so its ideal way to use id's instead of strings.
     */
}
