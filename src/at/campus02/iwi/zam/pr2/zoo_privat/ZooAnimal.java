package at.campus02.iwi.zam.pr2.zoo_privat;

public abstract class ZooAnimal {
    protected String name;

    public ZooAnimal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println( "macht ");
    }

    public void moved() {
        System.out.println(name + "bewegt sich ");
    }

    @Override
    public String toString() {
        return "ZooAnimal{" +
                "name='" + name + '\'' +
                '}';
    }
}
