package serenitylabs.tutorials;

import static serenitylabs.tutorials.TwelveHourClock.getWordForNumber;

/**
 * Created by smejari on 12/23/2016.
 */
public class QuarterTo implements TimeInWord {

    int hour;
    int min;

    public QuarterTo(int hour, int min) {
        this.min = min;
        this.hour = hour;

    }

    @Override
    public String getTime() {
        if (hour > 12) hour = hour - 12;
        return " a quarter to" + getWordForNumber(hour + 1);
    }
}
