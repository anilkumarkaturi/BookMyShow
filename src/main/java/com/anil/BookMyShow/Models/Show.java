package com.anil.BookMyShow.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
public class Show extends BaseModel{

    @ManyToOne
    private Movie movie;
    @ManyToOne
    private Theatre theatre;

    @OneToOne
    private Screen screen;
    private Date startTime;
    private Date endTime;
    private List<Feature> features;
    private String language;


}
