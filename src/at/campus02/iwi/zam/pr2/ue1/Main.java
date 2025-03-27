package at.campus02.iwi.zam.pr2.ue1;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie Ihr Alt ein: ");
        System.out.println("TEST ERROR");

        int age = scanner.nextInt();
        System.out.println("Ihr Alter: " + age);
        age=10;

        AgeCalculator meiRechner= new AgeCalculator();
        double days =meiRechner.ageInDays(age);
        System.out.println("Ihr Alt in Days: " + (int) days);
        System.out.println("Ihr Alt in Weeks: " + (int)meiRechner.ageInWeeks(age));
        System.out.println("Ihr Alt in Months: " +(int) meiRechner.ageInMonths(age));




    }
}
