package ue3_Jandl;

public class Wrappers {
    public static void main(String[] args) {
        int i = 0;
        System.out.println(i);

        Integer wrapperInt = 1;
        System.out.println(wrapperInt);

        Integer wrappingInt = 1;
        System.out.println(wrappingInt);

        double d = 1d; //1d statt 1.0
        System.out.println(d);

        Double wrappeDouble = 3d;
        System.out.println(wrappeDouble);


        //autoUnboxing
        int unwrapped = wrappingInt;

    }
}
