package serenitylabs.tutorials;

import static serenitylabs.tutorials.TwelveHourClock.getWordForNumber;

/**
 * Created by smejari on 12/23/2016.
 */
public class To implements TimeInWord {

    int hour;
    int min;

    public To(int hour, int min) {
        this.min = min;
        this.hour = hour;
    }

    @Override
    public String getTime() {
        if (hour > 12) hour = hour - 12;
        return getWordForNumber(60 - min) + " to" + getWordForNumber(hour + 1);
    }
}
