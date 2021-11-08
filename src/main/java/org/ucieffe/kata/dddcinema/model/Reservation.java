package org.ucieffe.kata.dddcinema.model;

import java.util.List;

public class Reservation {

    public final Customer customer;
    public final List<Seat> seatsReserved;
    public final DateTime expirationTime;
    public final Money totalAmount;

    public Reservation(Customer customer, List<Seat> seatsReserved, DateTime expirationTime, Money totalAmount) {
        this.customer = customer;
        this.seatsReserved = seatsReserved;
        this.expirationTime = expirationTime;
        this.totalAmount = totalAmount;
    }
}
