package ue3_Jandl.hotel_campus;

public class KeyRack {
    private Key[] keys;
    private int numberOfRooms;

    public KeyRack( int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        this.keys = new Key[numberOfRooms];
    }

    public Key[] getKeys() {
        return keys;
    }

    public void setKeys(Key[] keys) {
        this.keys = keys;
    }

    public int getNumberOfRooms() {
        return numberOfRooms;
    }

    public void setNumberOfRooms(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
    }

    public void giveKeyToGuest(Guest guest) {
        Key key = keys[guest.getRoomNumber()];
        if (key != null) {
            guest.setKey(key);
            key.setWithGuest(true);
            keys[guest.getRoomNumber()] = null;
        } else {
            System.out.println("Police! key is missing!");
        }
    }

    public void takeKeyBackFromGuest(Guest guest) {
        Key key = guest.getKey();
        key.setWithGuest(false);
        keys[guest.getRoomNumber()] = key;
        guest.setKey(null);

    }

    public void showKeyRack() {
//        for (Key key : keys) {
//            System.out.println(key); // Выводим каждый ключ
//        }
        for (int i = 0; i < keys.length; i++) {
            System.out.println(keys[i]);
        }


    }
}
