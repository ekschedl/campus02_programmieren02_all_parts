package at.campus02.iwi.zam.pr2.ue4_hase;

public class Osterhase extends Hase {
    public Osterhase(String name) {
        super(name);
    }

    public void vesteckeOstereier() {
        System.out.println("Osterhase hat Eier versteckt");
    }
    @Override
    public void hoppeln() {
        super.hoppeln();
        System.out.println("Osterhase hoppelt");
    }

}
