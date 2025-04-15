package at.campus02.iwi.zam.pr2.zoo_privat;

public class ZooPudel extends ZooDog {
    public ZooPudel(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Pudel Wuff!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": Pudel läuft auf seinen vier Pfoten");
    }
}
