package ue3_Jandl.collections;

import ue3_Jandl.Fossilien;

import java.util.List;

import java.util.ArrayList;

public class Lists {
    public static void main(String[] args) {
        Fossilien fossil1 = new Fossilien("name1", "farbe 1", "ort 1");
        Fossilien fossil2 = new Fossilien("name2", "farbe 1", "ort 1");
        Fossilien fossil3 = new Fossilien("name3", "farbe 1", "ort 1");
        Fossilien fossil4 = new Fossilien("name4", "farbe 1", "ort 1");
        Fossilien fossil5 = new Fossilien("name5", "farbe 1", "ort 1");
        List<Fossilien> fossils = new ArrayList<>();
        fossils.add(fossil1);
        fossils.add(fossil2);
        fossils.add(fossil3);
        fossils.add(fossil4);
        fossils.add(fossil5);


        for (Fossilien item : fossils) {
            System.out.println(item);
        }
        System.out.println(fossils.size());

        System.out.println("------------------");

        System.out.println(fossils.get(3));
        System.out.println("------------------");
        fossils.remove(fossil1);
        System.out.println(fossils.size());


        for (Fossilien item : fossils) {
            System.out.println(item);
        }
    }
}
