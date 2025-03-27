package at.campus02.iwi.zam.pr2.ue2;

import java.time.DayOfWeek;

public class OpeningHours {
    private final String OPENING_TIME;
    private final String CLOSING_TIME;
    private final OpeningVariations OPENING_VARIATIONS;

    public OpeningHours(String openingTime, String closingTime, OpeningVariations openingVariations) {
        this.OPENING_TIME = openingTime;
        this.CLOSING_TIME = closingTime;
        this.OPENING_VARIATIONS = openingVariations;
        System.out.println("Object OpeningHours created");
    }

    public String getOpeningHoursToday(DayOfWeek dayOfWeek_) {

        System.out.println("getOpeningHoursToday: i got the following Variablen");
        System.out.println("openingTime: " + OPENING_TIME );
        System.out.println("closingTime: " + CLOSING_TIME );
        System.out.println("openingVariations: " + OPENING_VARIATIONS );
        System.out.println("dayOfWeek: " + dayOfWeek_ );

        if(dayOfWeek_==DayOfWeek.SATURDAY || dayOfWeek_==DayOfWeek.SUNDAY){
            return "NICHT GEÖFFNET AM SA/SO";
        }
        if(dayOfWeek_==DayOfWeek.MONDAY && OPENING_VARIATIONS == OpeningVariations.TUETOFRI){
            return "NOT OPEN (DayOfWeek =Mon, OpeningVariations=TUETOFRI)";
        }
        return "Shop is open between " + OPENING_TIME + " and" + CLOSING_TIME;
        //return "Nicht implementiert" + System.getProperty("line.separator");


    }
}



