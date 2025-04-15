package at.campus02.iwi.zam.pr2.ue4_tier;

public class Main {
    public static void main(String[] args) {
        System.out.println("Start");
        System.out.println("Erstelle Beagle:");
        Beagle hundBeagle = new Beagle();
        System.out.println("Ende");
        Tier tier = new Tier("nana");
        tier.lermMachen();
        Beagle beagle = new Beagle();
        beagle.lermMachen();



    }
}
