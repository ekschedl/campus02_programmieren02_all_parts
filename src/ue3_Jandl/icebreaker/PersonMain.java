package ue3_Jandl.icebreaker;

import java.util.ArrayList;

public class PersonMain {
    public static void main(String[] args) {

        Favourites filmPers1 = new Favourites(Medium.FILM, "black mirrow");
        Favourites buchPers1 = new Favourites(Medium.BOOK, "java for children");

        ArrayList<Favourites> favouritesPers1 = new ArrayList<>();
        favouritesPers1.add(filmPers1);
        favouritesPers1.add(buchPers1);


        Person person1 = new Person("Ekaterina", "Schedlberger", favouritesPers1);{
            System.out.println(person1.introduceMe());
        }
    }
}
