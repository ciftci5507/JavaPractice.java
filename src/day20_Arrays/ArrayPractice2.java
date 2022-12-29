package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {

    public static void main(String[] args) {

        char[] letters = new char[26];

        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            letters[j] = i;
        }

        System.out.println(Arrays.toString(letters));

        System.out.println();



/*
        for (int j = 0; j < 26; j++) {

            for (char i = 'A'; i <= 'Z'; i++) {
                 = i;
            }
        }

 */





    }
}
