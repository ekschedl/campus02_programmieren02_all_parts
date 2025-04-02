package ue3_Jandl.hotel_me;

public class KeyRack {
    private Key[] keys;
    private int numberOfRooms;

    public KeyRack(int numberOfRooms) {
        this.numberOfRooms = numberOfRooms;
        this.keys = new Key[numberOfRooms];

        // Заполняем массив реальными ключами
        for (int i = 0; i < numberOfRooms; i++) {
            keys[i] = new Key(i + 1, false); // false = ключ пока не у гостя
        }
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

    public void giveKeyToGuest() {
        for (int i = 0; i < keys.length; i++) {
            if (!keys[i].isWithGuest()) {
                keys[i].setWithGuest(true);
                System.out.println("The key from room " + keys[i].getRoomNumber() + " was given");

                return;
            } else {
                System.out.println("Wir have no keys.No free rooms anymore");
            }
        }
    }


    public void takeKeyBackFromGuest() {
        for (int i = 0; i < keys.length; i++) {
            if (keys[i].isWithGuest()) {
                keys[i].setWithGuest(false);
                System.out.println("The key from room " + keys[i].getRoomNumber() + " was back");

                return;
            } else {
                System.out.println("all keys");
            }
        }
    }


    public void showKeyRack() {
        for (Key key : keys) {
            System.out.println(key); // Выводим каждый ключ
        }
    }

}

