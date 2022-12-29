package day20_Arrays;

import java.util.Arrays;

public class ArraysPractices {

    public static void main(String[] args) {

        //store the elements 10, 20, 50, 70
        int[] numbers = {10, 20, 50, 70};

        System.out.println(Arrays.toString(numbers));

        System.out.println("\n------------\n");

        int[] scores = new int[5];
        scores[1] = 85;
        scores[scores.length - 1] = 95;
        scores[3] = 75;
        scores[0] = 65;
        scores[2] = 55;


        System.out.println(Arrays.toString(scores));


        System.out.println("------------------");

        String[] month = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};

        // create a loop instead of typing by one one

        for (int i = 0; i < month.length; i++) {
            System.err.print(month[i] + " ");
        }

    }
}
