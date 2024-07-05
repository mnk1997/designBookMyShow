package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
@Getter
@Setter
@Entity
public class Seat extends BaseModel{
    private int rowNumber;
    private int colNumber;
    private String seatName;
    private SeatType seatType;
}
