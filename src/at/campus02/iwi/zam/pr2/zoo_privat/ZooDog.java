package at.campus02.iwi.zam.pr2.zoo_privat;

public class ZooDog extends ZooAnimal {
    public ZooDog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Wuff!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": läuft auf seinen vier Pfoten");
    }
}
