package at.campus02.iwi.zam.pr2.ue_3;

public class PersonMain {

    public static void main(String[] args) {
        System.out.println("Vererbung");
        Customer myCustomer = new Customer(3);

        Address myAddress = new Address("hafnerstrasse", "Graz", "Österreich", "8055");
        myCustomer.addAddress(myAddress);

    }
}
