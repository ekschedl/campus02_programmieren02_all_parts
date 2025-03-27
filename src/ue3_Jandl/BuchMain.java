package ue3_Jandl;

import javax.swing.*;

public class BuchMain {
    public static void main(String[] args) {


        Buch book1 = new Buch("harry poter", "1idnfnk1323", "jk rowling");

        BuecherBox box = new BuecherBox();

        box.legenBuch(book1);
        box.printContents();

    }
}
