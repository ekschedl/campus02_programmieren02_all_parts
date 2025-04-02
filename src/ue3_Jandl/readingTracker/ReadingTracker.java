package ue3_Jandl.readingTracker;

import ue3_Jandl.Buch;
import ue3_Jandl.Fossilien;

import java.util.ArrayList;
import java.util.List;

public class ReadingTracker {
    public static void main(String[] args) {
        Buch buch1 = new Buch("title1", "isbn 1", "Autor 1");
        Buch buch2 = new Buch("title2", "isbn 1", "Autor 1");
        Buch buch3 = new Buch("title3", "isbn 1", "Autor 1");
        Buch buch4 = new Buch("title4", "isbn 1", "Autor 1");
        int alreadyReadCounter = 0;
        int toBeReadCounter = 4;

        List<Buch> toBeRead = new ArrayList<>();
        toBeRead.add(buch1);
        toBeRead.add(buch2);
        toBeRead.add(buch3);
        toBeRead.add(buch4);

        List<Buch> alreadyRead = new ArrayList<>();


        // Iteriere rückwärts durch die Liste, um Bücher zu verschieben //durch "i--" vermeidest du das Problem,
        // dass sich die Liste verändert und du dadurch ein Element überspringen würdest. //beginnt mit Ende: buch 4, buch3....
        for (int i = toBeRead.size() - 1; i >= 0; i--) {
            Buch toBeMoved = toBeRead.get(i);  // holt das Buch aus der Liste
            toBeRead.remove(i);                // entfernt es aus "toBeRead"
            alreadyRead.add(toBeMoved);// fügt es zu "alreadyRead" hinzu
            toBeReadCounter--;
            alreadyReadCounter++;}


//        while (!toBeRead.isEmpty()) { //beginnt mit bch 1, buch2....
//            alreadyRead.add(toBeRead.remove(0)); // Immer das erste Element entfernen
//            alreadyReadCounter++;
//        }

        for (Buch einBuch : toBeRead) {
            System.out.println("toBeRead: " + einBuch);
        }

        for (Buch einBuch : alreadyRead) {
            System.out.println("alreadyRead: " + einBuch);

        }
        System.out.println("alreadyRead counter: " + alreadyReadCounter);
        System.out.println("toBeRead counter: " + toBeReadCounter);



    }

}

