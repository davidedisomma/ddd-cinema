package org.ucieffe.kata.dddcinema.model;

public class StudentTicket extends Ticket {
    public StudentTicket(Price price) {
        super(new Price(7, Currency.EUR));
    }
}
