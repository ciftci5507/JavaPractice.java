package day20_Arrays;

import java.util.Arrays;

public class ArraysIntro {

    public static void main(String[] args) {

        //create a variable that is capable of 5 names

        String[] myGroups = new String[5]; // 0-4

        myGroups[0] = "Gunay";
        myGroups[1] = "Neira";
        myGroups[2] = "Suat";
        myGroups[3] = "Hulya";
        myGroups[4] = "Mikael";

        //   System.out.println(myGroups); //hashcode error

        System.out.println(Arrays.toString(myGroups)); // ["Gunay", "Neira", "Suat", "Hulya", "Mikael"]

        System.out.println("---------------");

        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        System.out.println(Arrays.toString(days));

        int number = 5;

        if (number < 1 || number > 7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }

        System.out.println(days[number - 1]);


    }
}
