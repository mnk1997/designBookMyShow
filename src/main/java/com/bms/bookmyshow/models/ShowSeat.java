package com.bms.bookmyshow.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
public class ShowSeat extends BaseModel {
    private Show showId;
    private Seat seatId;
    private Integer showSeatPrice;
    private ShowSeatStatus showSeatStatus;

}
