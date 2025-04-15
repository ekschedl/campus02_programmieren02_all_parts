package at.campus02.iwi.zam.pr2.ue4_tier;

public class Hund extends Tier{


    public Hund() {
        super("EinHund");
        System.out.println("Konstruktor Hund");
    }

    @Override
    public void lermMachen() {
        super.lermMachen();
        System.out.println("hund macht lärm");

    }
}
