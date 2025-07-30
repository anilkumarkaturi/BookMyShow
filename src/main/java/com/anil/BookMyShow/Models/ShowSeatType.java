package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeatType extends BaseModel{

    @ManyToOne
    private Show show;
    @ManyToOne
    private SeatType seatType;
    private int price;

    /*
        M                 1
        ShowSeatType ---- Show
        1G
        1P
        1S

        here 1 is show number and G.P.S are seat types
     */

}
