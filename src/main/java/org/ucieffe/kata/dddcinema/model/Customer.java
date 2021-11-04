package org.ucieffe.kata.dddcinema.model;

import java.util.UUID;

public class Customer {
    public final UUID customerId;
    public final String firstName;
    public final String lastName;
    public final Sex sex;

    public Customer(UUID customerId, String firstName, String lastName, Sex sex) {
        this.customerId = customerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.sex = sex;
    }
}
