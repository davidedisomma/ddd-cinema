package org.ucieffe.kata.dddcinema.model;

import java.util.ArrayList;
import java.util.List;

public class Room {
    public final String name;
    public final List<Seat> seats;

    public Room(String name, List<Seat> seats) {
        this.name = name;
        this.seats = new ArrayList<>(seats);
    }
}
