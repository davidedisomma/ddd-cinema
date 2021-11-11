package org.ucieffe.kata.dddcinema.model;

import java.util.List;

public class Reservation {

    public final Customer customer;
    public final List<Seat> seatsReserved;
    public final DateTime expirationDateTime;
    public final DateTime reservationDateTime;
    public final Money totalAmount;

    public Reservation(Customer customer, List<Seat> seatsReserved, DateTime expirationDateTime, DateTime reservationDateTime, Money totalAmount) {
        this.customer = customer;
        this.seatsReserved = seatsReserved;
        this.expirationDateTime = expirationDateTime;
        this.reservationDateTime = reservationDateTime;
        this.totalAmount = totalAmount;
    }
}
