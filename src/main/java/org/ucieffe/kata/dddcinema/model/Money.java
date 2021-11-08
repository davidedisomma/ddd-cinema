package org.ucieffe.kata.dddcinema.model;

public class Money {
    public final Double amount;
    public final String currency;

    public Money(Double amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
