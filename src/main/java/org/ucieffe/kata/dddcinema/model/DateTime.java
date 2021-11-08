package org.ucieffe.kata.dddcinema.model;

public class DateTime {
    public final Date date;
    public final Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }
}
