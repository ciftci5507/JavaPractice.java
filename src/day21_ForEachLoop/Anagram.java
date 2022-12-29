package day21_ForEachLoop;

import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {

        String str1 = "acdb";
        String str2 = "dbca";

        char[] one = str1.toCharArray();
        char[] two = str2.toCharArray();

        Arrays.sort(one);
        Arrays.sort(two);

        boolean anagram = Arrays.equals(one, two);

        System.out.println("anagram = " + anagram);

        if (Arrays.toString(one).equals(Arrays.toString(two))) {
            System.out.println(str1 + " and " + str2 + " is anagram");
        }

        System.out.println(Arrays.toString(one));
        System.out.println(Arrays.toString(two));

    }
}
