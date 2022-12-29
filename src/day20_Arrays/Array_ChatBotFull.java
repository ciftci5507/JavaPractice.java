package day20_Arrays;

import java.util.Arrays;

public class Array_ChatBotFull {
    public static void main(String[] args) {

        int[] arrayName = {1, 3, 5, 6, 0, 3, 2, 3, 4, 5};

        int numberToMove = 3;
        int index = -1;

// Find the index of the number you want to move
        for (
                int i = 0;
                i < arrayName.length; i++) {
            if (arrayName[i] == numberToMove) {
                index = i;
                break;
            }
        }

// If the number was found in the array
        if (index != -1) {
            // Save the value of the number you want to move
            int temp = arrayName[index];

            // Shift all the elements after the number you want to move one position to the left
            for (int i = index; i < arrayName.length - 1; i++) {
                arrayName[i] = arrayName[i + 1];
            }

            // Assign the value of the number you want to move to the last element of the array
            arrayName[arrayName.length - 1] = temp;

        }
        System.out.println(Arrays.toString(arrayName));

    }
}