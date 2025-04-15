package at.campus02.iwi.zam.pr2.ue_3;

import java.util.ArrayList;

public class Customer extends Person {

    private int CustomerNumber;
    private ArrayList<Address> Addresses =new ArrayList<>();

    public Customer(int customerNumber) {
        CustomerNumber = customerNumber;
        System.out.println("Customer Constructor. Object created");
    }


    public Customer(int i, int customerNumber, ArrayList<Address> addresses) {
        CustomerNumber = customerNumber;
        Addresses = addresses;
    }


    public void addAddress(Address myAddress){
        Addresses.add(myAddress);
        System.out.println("Added Address");


    }

    @Override
    public String toString() {
        return "Customer{" +
                "CustomerNumber=" + CustomerNumber +
                '}';
    }


}
