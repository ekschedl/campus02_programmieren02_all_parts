package at.campus02.iwi.zam.pr2.zoo_privat;

public class ZooFrog extends ZooAnimal {

    public ZooFrog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + ": Quack!");
    }

    @Override
    public void moved() {
        System.out.println(name + ": springt hoch");
    }
}
