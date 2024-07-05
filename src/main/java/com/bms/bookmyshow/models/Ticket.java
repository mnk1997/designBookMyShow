package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Entity
public class Ticket extends BaseModel {
    private List<Show> shows;
    private User userId;
    private int amount;

}
