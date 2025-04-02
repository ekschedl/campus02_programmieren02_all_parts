package ue3_Jandl.hotel_campus;

public class Reception {

    public static void main(String[] args) {
        Guest guest = new Guest(null, 1, "Irina");
        KeyRack myKeyRack = new KeyRack(3);

        Key key1 = new Key(0, false);
        Key key2 = new Key(1, false);
        Key key3 = new Key(2, false);


        myKeyRack.getKeys()[0]=key1;
        myKeyRack.getKeys()[1]=key2;
        myKeyRack.getKeys()[2]=key3;

        myKeyRack.showKeyRack();
        myKeyRack.giveKeyToGuest(guest);
        System.out.println("-------------------------------");
        myKeyRack.showKeyRack();

    }
}
