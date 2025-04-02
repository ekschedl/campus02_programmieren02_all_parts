package ue3_Jandl.gifts;

import java.time.LocalDate;
import java.util.ArrayList;

public class Organizer_Main {
    public static void main(String[] args) {
        Person donna = new Person("Donna", LocalDate.of(1996, 11, 11));
        Person clarissa = new Person("Clarissa", LocalDate.of(2000, 1, 11));
        Person ina = new Person("Inna", LocalDate.of(1987, 4, 1));

        Gift gamingPC = new Gift("gaming PC", 1500, "sehr cool");
        Gift flowers = new Gift("bunte Blumen", 35);
        Gift ticket = new Gift("Flug Tickets", 2000, "evtl nach Bali");
        Gift book = new Gift("Buch: Clean Code", 20);
        Gift book2 = new Gift("Buch2" , 10);

        Gift voucher = new Gift("Voucher", 50, "Graz Gutschein");


        donna.getGiftIdea().add(ticket);
        donna.getGiftIdea().add(flowers);
        donna.getGiftIdea().add(voucher);
        donna.getAlreadyGifted().add(book);

        clarissa.getGiftIdea().add(ticket);
        clarissa.getGiftIdea().add(ticket);
        clarissa.getGiftIdea().add(ticket);
        clarissa.getGiftIdea().add(ticket);
        clarissa.getAlreadyGifted().add(flowers);

        ina.getGiftIdea().add(ticket);
        ina.getGiftIdea().add(book2);
        ina.getGiftIdea().add(book);
        ina.getGiftIdea().add(voucher);
        ina.getAlreadyGifted().add(voucher);


        ArrayList<Person> people = new ArrayList<>();
        people.add(ina);
        people.add(donna);
        people.add(clarissa);


        ArrayList<Gift> gifts = new ArrayList<>();
        gifts.add(gamingPC);
        gifts.add(book);
        gifts.add(book2);
        gifts.add(flowers);
        gifts.add(ticket);
        gifts.add(voucher);

        OrganizingService service=new OrganizingService(gifts, people);
        ArrayList<Gift> giftsForIna = service.findGiftFor(ina);
        System.out.println("Gifts  for Inna: ");
        for (Gift gift: giftsForIna) {
            System.out.println(gift.getLabel());
        }

        ArrayList<Person> birthdaysBefore= service.birthdaysBefore(LocalDate.of(2025, 12, 24));
        System.out.println("This people have a birthday before Christmas: ");
        for (Person person: birthdaysBefore) {
            System.out.println(person.getName());
        }

        ArrayList<Gift> giftsInPriceRange=service.findGiftsInPriceRange(gifts,10,30);
        System.out.println("Range 10-30: ");
        for (Gift gift: giftsInPriceRange) {
            System.out.println(gift.getLabel());
        }


        ArrayList<Gift> giftsInPriceRangeIna=service.findGiftsInPriceRange(giftsForIna,10,30);
        System.out.println("Range 10-30: ");
        for (Gift gift: giftsInPriceRangeIna) {
            System.out.println(gift.getLabel());
        }

        System.out.println("Inna has already received a:" +service.hasAlreadyBeenGifted(ina, ticket));
        service.giveGift(ina, ticket);
        System.out.println("Inna nachdem service.giveGift(ina, ticket) :" +service.hasAlreadyBeenGifted(ina, ticket));

    }
}
