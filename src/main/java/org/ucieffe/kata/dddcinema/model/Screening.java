package org.ucieffe.kata.dddcinema.model;


import java.util.List;
import java.util.UUID;

public class Screening {

    public final UUID uuid;
    public final Movie movie;
    public final DateTime schedulingTime;
    public final Room room;
    public final List<Seat> availableSeats;
    public final List<Reservation> reservations;

    public Screening(UUID uuid, Movie movie, DateTime schedulingTime, Room room, List<Seat> availableSeats, List<Reservation> reservations) {
        this.uuid = uuid;
        this.movie = movie;
        this.schedulingTime = schedulingTime;
        this.room = room;
        this.availableSeats = availableSeats;
        this.reservations = reservations;
    }
}
