package day22_MultiDimensionalArray;

import java.util.Arrays;

public class ReverseSecondWord {

    public static void main(String[] args) {

        String sentence = "Today is a good day to learn Java";

        String[] arr1 = sentence.split(" ");

        String word = arr1[3];
        String reWord = "";

        for (int i = word.length() - 1; i >= 0; i--) {
            reWord += word.charAt(i);
        }

        arr1[3] = reWord;

        System.out.println(Arrays.toString(arr1));

    }
}
