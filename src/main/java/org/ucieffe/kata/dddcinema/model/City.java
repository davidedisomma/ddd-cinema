package org.ucieffe.kata.dddcinema.model;

public class City {
    public final String name;
    public final Country country;

    public City(String name, Country country) {
        this.name = name;
        this.country = country;
    }
}
