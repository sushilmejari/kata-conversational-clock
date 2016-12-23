package serenitylabs.tutorials;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by smejari on 12/23/2016.
 */
public class TwelveHourClock {


    private static final String[] numNames = {
            "",
            " one",
            " two",
            " three",
            " four",
            " five",
            " six",
            " seven",
            " eight",
            " nine",
            " ten",
            " eleven",
            " twelve",
            " thirteen",
            " fourteen" };
    protected static Map<Integer, String> clock = new HashMap();

    static {
        for (int i = 0; i < numNames.length; i++) {
            clock.put(i, numNames[i]);
        }
    }


    public static String getWordForNumber(int num) {
        return clock.get(num);
    }


}
