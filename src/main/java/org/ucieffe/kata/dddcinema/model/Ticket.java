package org.ucieffe.kata.dddcinema.model;

import java.util.UUID;

public abstract class Ticket {

    public final Price price;

    public Ticket(Price price) {
        this.price = price;
    }
}
