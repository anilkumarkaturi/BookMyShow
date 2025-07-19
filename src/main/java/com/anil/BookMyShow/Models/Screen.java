package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class Screen extends BaseModel{

    private String name;

    @OneToMany
    private List<Seat> seats;
    private List<Feature> features;
}
