package day20_Arrays;

import java.util.Arrays;

public class MoveZerosToEnd_Task {

    public static void main(String[] args) {

        int[] array1 = {10, 0, 5, 0, 1, 0};

        int[] arrayEndsZero = new int[array1.length];

        for (int i = 0, j = array1.length - 1; j >= 0 && i < array1.length; j--, i++) {
            if (array1[i] == 0) {
                arrayEndsZero[j] = array1[i];
            } else {
                arrayEndsZero[i] = array1[i];
            }
        }

        System.out.println(Arrays.toString(arrayEndsZero));
    }
}

        /*
        int i = 0;
        int j = array1.length - 1;
        for (int each : array1) {
            if (each != 3) {
                arrayEndsZero[i++] = each;
            } else {
                arrayEndsZero[j--] = each;
            }
        }

        System.out.println(Arrays.toString(arrayEndsZero));
         */


/*

6. write a program that can move all the zeros to the end of the array
        Ex:
            array = {10, 0, 5, 0, 1, 0};

            output:
                 {10, 5, 1, 0, 0, 0}
 */