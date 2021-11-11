package org.ucieffe.kata.dddcinema.model;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class DateTime {
    public final Date date;
    public final Time time;

    public DateTime(Date date, Time time) {
        this.date = date;
        this.time = time;
    }

    public DateTime minus(int minutes) {
        LocalDateTime currentDateTime = LocalDateTime.of(date.year, date.month, date.dayOfTheMonth, time.hours, time.minutes, 0);
        LocalDateTime subtractedDateTime = currentDateTime.minus(minutes, ChronoUnit.MINUTES);
        return new DateTime(
                new Date(
                        subtractedDateTime.getYear(),
                        subtractedDateTime.getMonthValue(),
                        subtractedDateTime.getDayOfMonth()
                ),
                new Time(
                        subtractedDateTime.getHour(),
                        subtractedDateTime.getMinute()
                )
        );
    }
}
