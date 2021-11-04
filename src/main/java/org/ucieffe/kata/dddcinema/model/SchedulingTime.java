package org.ucieffe.kata.dddcinema.model;

public class SchedulingTime {
    public final Date date;
    public final Time time;

    public SchedulingTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }
}
