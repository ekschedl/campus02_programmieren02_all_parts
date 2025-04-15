package at.campus02.iwi.zam.pr2.ue4_hase;

public class Weihnachtshase extends Hase{


    public Weihnachtshase(String name) {
        super(name);
    }

    @Override
    public void hoppeln() {
        super.hoppeln();
        System.out.println("Weihnachtshase hoppelt");
    }
}
