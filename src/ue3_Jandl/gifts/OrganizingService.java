package ue3_Jandl.gifts;

import java.time.LocalDate;
import java.util.ArrayList;

public class OrganizingService {
    ArrayList<Gift> gifts; // Liste aller Geschenke
    ArrayList<Person> persons; // Liste aller Personen

    // Konstruktor: Initialisiert die Listen von Geschenken und Personen
    public OrganizingService(ArrayList<Gift> gifts, ArrayList<Person> persons) {
        this.gifts = gifts;
        this.persons = persons;
    }

    // Findet Geschenkideen für eine bestimmte Person
    public ArrayList<Gift> findGiftFor(Person person) {
        return person.getGiftIdea();
    }

    // Findet Personen, die vor einem bestimmten Datum Geburtstag haben
    public ArrayList<Person> birthdaysBefore(LocalDate date) {
        ArrayList<Person> hasBirthdaySoon = new ArrayList<>();

        for (Person person : persons) {
            int currentYear = LocalDate.now().getYear(); // Aktuelles Jahr
            int birthdayMonth = person.getBirthday().getMonthValue(); // Geburtsmonat
            int birthdayDay = person.getBirthday().getDayOfMonth(); // Geburtstagstag

            // Geburtstag im aktuellen Jahr berechnen
            LocalDate birthdayThisYear = LocalDate.of(currentYear, birthdayMonth, birthdayDay);
            if (birthdayThisYear.isAfter(LocalDate.now()) && birthdayThisYear.isBefore(date)) {
                hasBirthdaySoon.add(person);
            }
        }
        return hasBirthdaySoon; // Rückgabe der Liste mit baldigen Geburtstagen
    }


    public ArrayList<Gift> findGiftsInPriceRange(ArrayList<Gift> giftList, int min, int max) {
        ArrayList<Gift> giftsInRange = new ArrayList<>();
        for (Gift gift : gifts) {
            if (gift.getPrice() >= min && gift.getPrice() <= max) {
                giftsInRange.add(gift);
            }
        }
        return giftsInRange;
    }


    public void giveGift(Person person, Gift gift) {
        person.getAlreadyGifted().add(gift);
        person.getGiftIdea().remove(gift);
    }

    public boolean hasAlreadyBeenGifted(Person person, Gift gift) {
        return person.getAlreadyGifted().contains(gift);
    }

}
