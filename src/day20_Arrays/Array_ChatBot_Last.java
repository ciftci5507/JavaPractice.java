package day20_Arrays;
import java.util.Arrays;
public class Array_ChatBot_Last {
    public static void main(String[] args) {
        int[] arrayName = {1, 3, 6, 3, 3, 0, 8, 3, 7};

        int numberToMove = 3;
        int count = 0;
        for (int i = 0; i < arrayName.length; i++) {
            if (arrayName[i] == numberToMove) {
                count++;
            } else if (count > 0) {
                arrayName[i - count] = arrayName[i];
            }
        }
        for (int i = arrayName.length - count; i < arrayName.length; i++) {
            arrayName[i] = numberToMove;
        }

        System.out.println(Arrays.toString(arrayName));

    }
}
