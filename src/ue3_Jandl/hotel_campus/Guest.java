package ue3_Jandl.hotel_campus;

public class Guest {
    private Key key;
    private int roomNumber;
    private String Name;

    public Guest(Key key, int roomNumber, String name) {
        this.key = key;
        this.roomNumber = roomNumber;
        Name = name;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}

