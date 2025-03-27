package ue3_Jandl.generics;

import ue3_Jandl.Buch;

public class GenericArchive {
    public static void main(String[] args) {
        GenericsBox<Buch> buchBox = new GenericsBox<>();
        Buch buch = new Buch("buch 1", "irir35453", "author 1");
        buchBox.putItem(buch);
        buchBox.printContents();

        Printer<Buch> buchPrinter =new Printer<>();
        buchPrinter.print(buch);

    }
}
