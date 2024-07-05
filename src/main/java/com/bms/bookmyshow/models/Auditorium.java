package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@Entity
public class Auditorium extends BaseModel {
    private List<Seat> seats;
    private Screen screen;
    private List<AuditoriumFeature> auditoriumFeatures ;
}
