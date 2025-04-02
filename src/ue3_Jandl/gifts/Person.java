package ue3_Jandl.gifts;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;

public class Person {


    private String name;
    private LocalDate birthday;
    private ArrayList<Gift> giftIdea;
    private ArrayList<Gift> alreadyGifted;

    public Person(String name, LocalDate birthday) {
        this.name = name;
        this.birthday = birthday;
        this.giftIdea = new ArrayList<Gift>();
        this.alreadyGifted = new ArrayList<Gift>();
    }


    public void addGift(Gift gift){
        this.giftIdea.add(gift);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public ArrayList<Gift> getGiftIdea() {
        return giftIdea;
    }

    public void setGiftIdea(ArrayList<Gift> giftIdea) {
        this.giftIdea = giftIdea;
    }

    public ArrayList<Gift> getAlreadyGifted() {
        return alreadyGifted;
    }

    public void setAlreadyGifted(ArrayList<Gift> alreadyGifted) {
        this.alreadyGifted = alreadyGifted;
    }


}
