package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat extends BaseModel{

    private int rowNumber;
    private int columnNumber;
    private int seatNumber;

    @ManyToOne
    private SeatType seatType;
}
