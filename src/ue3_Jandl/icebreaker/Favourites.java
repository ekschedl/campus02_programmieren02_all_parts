package ue3_Jandl.icebreaker;

import java.util.ArrayList;
import java.util.List;

public class Favourites {
    Medium medium;
    String title;
    String comment;

    public Favourites(Medium medium, String title) {
        this.medium = medium;
        this.title = title;
    }

    public Favourites(Medium medium, String title, String comment) {
        this.medium = medium;
        this.title = title;
        this.comment = comment;
    }
}


