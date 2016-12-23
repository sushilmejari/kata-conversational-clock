package serenitylabs.tutorials;

import static serenitylabs.tutorials.TwelveHourClock.getWordForNumber;

/**
 * Created by smejari on 12/23/2016.
 */
public class Oclock implements TimeInWord {
    int hour;

    public Oclock(int hour) {
        this.hour = hour;
    }

    @Override
    public String getTime() {
        if (hour > 12) hour = hour - 12;
        return getWordForNumber(hour) + " o'clock";
    }
}
