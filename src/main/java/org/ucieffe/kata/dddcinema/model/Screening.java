package org.ucieffe.kata.dddcinema.model;


public class Screening {

    public final Movie movie;
    public final SchedulingTime schedulingTime;

    public Screening(Movie movie, SchedulingTime schedulingTime) {
        this.movie = movie;
        this.schedulingTime = schedulingTime;
    }
}
