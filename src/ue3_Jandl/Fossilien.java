package ue3_Jandl;

public class Fossilien {
    private String name;
    private String farbe;
    private String woGibts;

    public Fossilien(String name, String farbe, String woGibts) {
        this.name = name;
        this.farbe = farbe;
        this.woGibts = woGibts;
    }

    @Override
    public String toString() {
        return "Fossilien{" +
                "name='" + name + '\'' +
                ", farbe='" + farbe + '\'' +
                ", woGibts='" + woGibts + '\'' +
                '}';
    }
}
