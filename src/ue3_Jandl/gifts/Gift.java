package ue3_Jandl.gifts;

public class Gift {
private  String label;
private double price;
private String description;

    public Gift(String label, double price) {
        this.label = label;
        this.price = price;
    }

    public Gift(String label, double price, String description) {
        this.label = label;
        this.price = price;
        this.description = description;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
