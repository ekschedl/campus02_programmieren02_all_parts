package ue3_Jandl.hotel_campus;

import java.util.HashMap;

public class GuestBook {
    private HashMap<Guest, String> guestBookNotices;

    public GuestBook() {
        this.guestBookNotices = new HashMap<>();
    }

    public void addNotice(Guest guest, String notice){
        this.guestBookNotices.put(guest, notice );

    }

    public void printGuestBook(Guest guest, String notice){


        this.guestBookNotices.put(guest, notice );

        //es wird noch nachgefüllt , es ist nicht alles


    }
}
