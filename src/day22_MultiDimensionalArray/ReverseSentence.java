package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSentence {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] arr1 = sentence.split(" ");

        String reversedSentenced = "";

        for (int i =arr1.length-1; i >= 0; i--) {
            reversedSentenced += arr1[i] + " ";
        }

        System.out.println(reversedSentenced);

    }
}
