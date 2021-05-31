package model;

import java.time.LocalTime;

public class TaskSchedule {

    private final LocalTime fromTime;
    private final LocalTime toTime;

    public TaskSchedule(LocalTime fromTime, LocalTime toTime) {
        this.fromTime = fromTime;
        this.toTime = toTime;
    }

    public LocalTime getFromTime() {
        return fromTime;
    }

    public LocalTime getToTime() {
        return toTime;
    }
}
