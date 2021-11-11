package org.ucieffe.kata.dddcinema.model;

public class ChildTicket extends Ticket {
    public ChildTicket(Price price) {
        super(new Price(5, Currency.EUR));
    }
}
