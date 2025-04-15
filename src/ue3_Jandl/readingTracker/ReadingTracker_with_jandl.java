package ue3_Jandl.readingTracker;

import ue3_Jandl.Buch;

import java.util.ArrayList;
import java.util.List;

public class ReadingTracker_with_jandl {
    public static void main(String[] args) {
        List<Buch> toBeRead = new ArrayList<Buch>();
        List<Buch> alreadyRead = new ArrayList<Buch>();

        Buch buch1 = new Buch("title1", "isbn 1", "Autor 1");
        Buch buch2 = new Buch("title2", "isbn 1", "Autor 1");
        Buch buch3 = new Buch("title3", "isbn 1", "Autor 1");
        Buch buch4 = new Buch("title4", "isbn 1", "Autor 1");

        toBeRead.add(buch1);
        toBeRead.add(buch2);
        toBeRead.add(buch3);
        toBeRead.add(buch4);


        // Zeige die Listen an, bevor wir ein Buch lesen
        System.out.println("To Be Read:");
        showList(toBeRead);

        System.out.println("\nAlready Read:");
        showList(alreadyRead);
        System.out.println("---------");


        read(buch1, toBeRead, alreadyRead);
        read(buch2, toBeRead, alreadyRead);
        System.out.println("To Be Read:");
        showList(toBeRead);

        System.out.println("\nAlready Read:");
        showList(alreadyRead);

    }

    public static void showList(List<Buch> buecher) {  // Hier List<Buch> verwenden
        if (buecher.isEmpty()) {
            System.out.println("Keine Bücher vorhanden.");
        } else {
            for (Buch buch : buecher) {
                System.out.println(buch);
            }
        }
    }

    public static void read(Buch buch, List<Buch> toBeRead, List<Buch> alreadyRead) {

        if (toBeRead.contains((buch))) {
            alreadyRead.add(buch);
            toBeRead.remove(buch);


        }


    }
}

