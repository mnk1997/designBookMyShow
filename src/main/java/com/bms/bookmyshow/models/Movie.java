package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
@Entity
public class Movie extends BaseModel{
    private String movieName;
    private Date releaseDate;
}
