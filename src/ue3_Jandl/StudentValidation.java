package ue3_Jandl;

import java.util.Scanner;

public class StudentValidation {
    public static void main(String[] args) {
        final int MIN_AGE = 18;
        final int MAX_AGE = 99;
        final double MIN_GRADE = 1;
        final double MAX_GRADE = 2.5;
        Integer wrappedAge = null;
        Double wrappedGrade = null;

        System.out.println("How old are you:");
        Scanner scanner = new Scanner(System.in);

        wrappedAge = scanner.nextInt();

        if (wrappedAge < MIN_AGE || wrappedAge > MAX_AGE) {
            System.out.println("Sorry, you cannot participate in this program");
        } else {
            System.out.println("Whats your grade average:");
            wrappedGrade = scanner.nextDouble();
            if (wrappedGrade < MIN_GRADE || wrappedGrade > MAX_GRADE) {
                System.out.println("Sorry, you cannot participate in this program");
            } else {
                System.out.println("What is your field of study:");
                String study = scanner.next().toUpperCase();
                if (FieldOfStudy.INFORMATICS.toString().equals(study)) {
                    System.out.println("Congrats, you are in!!");
                } else {
                    System.out.println("Sorry, try again another time");
                }
                System.out.println("Age: " + wrappedAge +
                        "\nAge: " + wrappedGrade +
                        "\nField of Study: " + study);

            }

        }
    }

}
