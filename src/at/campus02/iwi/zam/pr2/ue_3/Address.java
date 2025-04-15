package at.campus02.iwi.zam.pr2.ue_3;

public class Address {

    private String street;
    private String city;
    private String country;
    private String zip;


    public Address(String street, String city, String country, String zip) {
        this.street = street;
        this.city = city;
        this.country = country;
        this.zip = zip;
        System.out.println("Address Constructor. Object created");

    }

    @Override
    public String toString() {
        return "Adress{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
