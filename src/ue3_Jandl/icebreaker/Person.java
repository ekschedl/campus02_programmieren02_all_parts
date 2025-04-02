package ue3_Jandl.icebreaker;

import java.util.ArrayList;

public class Person {
    private static String firstName;
    private static String lastName;
    private static ArrayList<Favourites> favourites;

    public Person(String firstName, String lastName, ArrayList<Favourites> favourites) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.favourites = favourites;
    }

    public static String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public static String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String introduceMe() {
        String intro = "Ich heiße: " + firstName + " " + lastName + ".";

        if (!favourites.isEmpty()) {
            if (favourites.size() == 1) {
                intro += " Mein Lieblingsding ist";
            } else {
                intro += " Meine Lieblingssachen sind";
            }

            for (Favourites favourite : favourites) {
                intro += " " + favourite.medium + " mit dem Titel \"" + favourite.title + "\".";
                if (favourite.comment != null) {
                    intro += " " + favourite.comment + ".";
                }
            }
        }

        return intro;
    }
}
