package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
public class City extends BaseModel{

    private String name;

    @OneToMany(mappedBy = "city")
    private List<Theatre> theatres;
}
