package ue3_Jandl.hotel_me;

public class Guest {
   private Key[] keys;
   private int roomNumber;
   private String Name;

   public Guest(int roomNumber, String name) {
      this.roomNumber = roomNumber;
      Name = name;
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

