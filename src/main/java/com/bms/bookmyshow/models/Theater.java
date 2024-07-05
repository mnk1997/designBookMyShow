package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.awt.print.Book;
import java.util.List;
@Getter
@Setter
@Entity
public class Theater extends BaseModel{

    String theaterName;
    String theaterAddress;
    String cityId;
    List<Show> shows;
}
