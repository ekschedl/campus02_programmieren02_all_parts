package at.campus02.iwi.zam.pr2.ue_3;

import java.time.LocalDate;

public class ue_3 {

    public static void main(String[] args) {
        System.out.println("test");
        //Boxing Double age=99.44;
        // Auto unboxing was ist?


        Integer age = null;  // Wrapper-Klasse, kann null sein
        if (age != null && age > 18) {  // Null-Check, bevor Vergleich
            System.out.println("Sie dürfen studieren");
        } else {
            System.out.println("dkfk");
        }


        LocalDate today = LocalDate.now();  // Korrekt, keine "new"-Schlüsselwort erforderlich}
        System.out.println(today);


    }

// els if kann mann mit rerutn und sout  ausserhalb der sjcleife ausgebene-



}