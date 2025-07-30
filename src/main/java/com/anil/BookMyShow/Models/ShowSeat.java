package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class ShowSeat extends BaseModel{

    @ManyToOne
    private Show show;
    @ManyToOne
    private Seat seat;
    @Enumerated(EnumType.ORDINAL)
    private ShowSeatStatus showSeatStatus;

    /*

    ShowSeat ------ Show ==> M:1
    M               1

    ShowSeat ----- Seat ==> M:1
    M               1

  1A1
  1A2
  1A3
  1B1
  1B2
  1B3

here 1 is the show and A1,A2,... are the seats

here is the hack if there are 2 models X and Y if we combine X and Y then
cardinality is

XY ---- X manytoone
XY ---- Y manytoone

     */
}
