package day20_Arrays;

import java.util.Arrays;

public class Array_ChatBot {

    public static void main(String[] args) {
        int[] arrayName = {1,3, 2, 3, 4, 5};

        int numberToMove = 3;
        int indexToMove = arrayName.length - 1;

        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == numberToMove) {
                arrayName[i] = arrayName[indexToMove];
                arrayName[indexToMove] = numberToMove;
            }
        }
        /*
// Find the index of the number you want to move
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == numberToMove) {
                index = i;
                break;
            }
        }

         */
        System.out.println(Arrays.toString(arrayName));
    }
}
