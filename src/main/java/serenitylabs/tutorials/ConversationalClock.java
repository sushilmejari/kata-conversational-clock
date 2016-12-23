package serenitylabs.tutorials;

public class ConversationalClock {
    private final SystemTime now;
    private TimeInWord timeInWord;

    public ConversationalClock(SystemTime time) {
        this.now = time;
        timeInWord = setTimeStretegy(time.hour(), time.minute());

    }


    public TimeInWord setTimeStretegy(int hour, int min) {
        TimeInWord timeInWord = null;
        if (min == 0) {
            if (hour == 12)
                timeInWord = new Noon();
            else if (hour == 24)
                timeInWord = new Midnight();
            else
                timeInWord = new Oclock(hour);
        } else if (min <= 2 && min > 0)
            timeInWord = new JustAfter(hour, min);
        else if ((min > 3 && min < 30) || (min > 45 && min < 50))
            timeInWord = new Past(hour, min);
        else if (min == 30)
            timeInWord = new HalfPast(hour, min);
        else if (min > 30 && min < 45)
            timeInWord = new JustAfterHalfPast(hour, min);
        else if (min == 45)
            timeInWord = new QuarterTo(hour, min);
        else if (min >= 50 && min < 55)
            timeInWord = new To(hour, min);
        else if (min > 54 && min < 60)
            timeInWord = new Almost(hour, min);

        return timeInWord;
    }


    public String currentTime() {


        return "it's" + timeInWord.getTime();
    }
}
