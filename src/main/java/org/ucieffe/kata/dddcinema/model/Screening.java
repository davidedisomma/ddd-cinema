package org.ucieffe.kata.dddcinema.model;


import java.util.List;

public class Screening {

    public final Movie movie;
    public final SchedulingTime schedulingTime;
    public final Room room;
    public final List<Seat> availableSeats;

    public Screening(Movie movie, SchedulingTime schedulingTime, Room room, List<Seat> availableSeats) {
        this.movie = movie;
        this.schedulingTime = schedulingTime;
        this.room = room;
        this.availableSeats = availableSeats;
    }
}
