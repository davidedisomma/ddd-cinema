package org.ucieffe.kata.dddcinema.model;

import java.util.Collections;
import java.util.List;

public class Cinema {
    public final String name;
    public final City city;
    public final List<Room> rooms;

    public Cinema(String name, City city, List<Room> rooms) {
        this.name = name;
        this.city = city;
        this.rooms = Collections.unmodifiableList(rooms);
    }
}
