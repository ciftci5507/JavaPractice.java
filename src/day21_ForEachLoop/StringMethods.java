package day21_ForEachLoop;

import java.util.Arrays;

public class StringMethods {

    public static void main(String[] args) {

        String str = "Java";

        for (char each : str.toCharArray()) {
            System.out.println(each);
        }

        System.out.println();

        char[] chars = str.toCharArray();
        System.out.println(Arrays.toString(chars));

        System.out.println("___________________");


        String sentence = "Wooden Spoon";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));

        System.out.println("--------------------------");

        String email = "WoodenSpoon@cydeo.com";

        String[] arr = email.split("@");

        System.out.println(Arrays.toString(arr));

        System.out.println("------------------------------");

        String a = "Today is a nice day. Today is monday. Today we learn Java.";

        String[] sentences = a.split("\\.");

        System.out.println(Arrays.toString(sentences));

    }
}
