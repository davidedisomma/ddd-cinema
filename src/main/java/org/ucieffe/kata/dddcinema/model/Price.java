package org.ucieffe.kata.dddcinema.model;

public class Price {
    public final double amount;
    public final Currency currency;

    public Price(double amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
