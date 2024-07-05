package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.Date;
import java.util.List;
@Getter
@Setter
@Entity
public class Show extends BaseModel {
    private Movie movie;
    private Date startTime;
    private Auditorium auditorium;
    private List<ShowSeat> showSeats;

}
