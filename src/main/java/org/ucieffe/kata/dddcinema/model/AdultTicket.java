package org.ucieffe.kata.dddcinema.model;

public class AdultTicket extends Ticket{

    public AdultTicket(Price price) {
        super(new Price(10, Currency.EUR));
    }
}
