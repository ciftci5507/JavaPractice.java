package day04_Variables;

public class PrimitivesIntro {

    public static void main(String[] args) {

        //age: 38 years old
        byte age = 38;

        /* weight: 160 pounds */
        int weight = 160;
        // 160 is out of byte' range

        //short weight = 160;

        //salary: 100000 $
        int salary = 100000; // out of short's range
        //int salary = 100000; // preferred data type for integer is int

        long asset = 3_333_333_333L;

        //tax: 0.26

        float tax = 0.26F;

        double PI = 3.14;

        char ch1 = 865;
        System.out.println("ch1 = " + ch1);

        char ch2 = 00;
        System.out.println("ch2 = " + ch2);

        boolean isEmployeed = true;
        boolean isMarried = false;

        String name = "Muhammed";




    }


}
