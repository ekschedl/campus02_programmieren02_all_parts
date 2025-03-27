package at.campus02.iwi.zam.pr2.ue2;

import java.time.DayOfWeek;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start Übung 2++");
        OpeningHours openingHours=new OpeningHours("07:00", "23:00", OpeningVariations.MONTOFRI);
        System.out.println("UE 2end");

        Shop myShop1=new Shop("best Shop in Town", openingHours);
        OpeningHours openingHours1MyShop1=myShop1.getOpeningHours();
        String isOpen=openingHours1MyShop1.getOpeningHoursToday(DayOfWeek.SUNDAY);
        System.out.println("isOpen: '" + isOpen +"'");
    }
}
