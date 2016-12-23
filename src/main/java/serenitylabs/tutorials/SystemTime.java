package serenitylabs.tutorials;

import java.time.LocalTime;

import static java.lang.String.format;

class SystemTime {

    private final LocalTime time;

    SystemTime(LocalTime time) {
        this.time = time;
    }

    /**
     * @return the hour of the day a 24-hour format
     */
    public int hour() {
        return time.getHour();
    }

    /**
     * @return the minute of the hour
     */
    public int minute() {
        return time.getMinute();
    }

    @Override
    public String toString() {
        return format("%01d:%01d", hour(), minute());
    }

    /*private LocalTime now() {
        return LocalTime.now();
    }*/
}
