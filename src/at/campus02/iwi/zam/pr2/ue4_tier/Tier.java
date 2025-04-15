package at.campus02.iwi.zam.pr2.ue4_tier;

public class Tier {

    private String name;

    public Tier(String name) {

        System.out.println("Konstruktor Tier");
    }

  public void lermMachen() { //final kann nicht mehr überschrieben werden
        System.out.println("Tier macht lärm");
    }
}
