package ue3_Jandl;

import javax.swing.*;

public class FossilienMain {
    public static void main(String[] args) {
        Fossilien fossil1 = new Fossilien("first", "blau", "Russland");
        Fossilien fossil2 = new Fossilien("second", "yellow", "Austria");

        FossilienKiste myBox = new FossilienKiste();
        myBox.legenFossilien(fossil1);
        myBox.legenFossilien(fossil2);

        myBox.ausgebenKisteFossilen();


    }
}
