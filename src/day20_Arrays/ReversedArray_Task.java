package day20_Arrays;

import java.util.Arrays;

public class ReversedArray_Task {

    public static void main(String[] args) {

        int[] array = {3, 1, 9, 5, 4, 7, 2, 6, 10};
        int[] reversedArray = new int[array.length];

        for (int i = 0, j = array.length - 1; j >= 0 && i < array.length; j--, i++) {
            reversedArray[i] = array[j];
        }

        System.out.println(Arrays.toString(reversedArray));
    }
}

/*
	5.  Write a program that can reverse an array of integers and returns it as new array
        ex:
            array = {1,2,3,4,5};

        output:
            reversedArray = {5,4,3,2,1};
 */