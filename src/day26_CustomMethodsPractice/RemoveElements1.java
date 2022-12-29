package day26_CustomMethodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {
        int[] numbers = {123, 445, 6, 7, 888, 432, 454};
        numbers = removeElement(numbers, 1);
        numbers = removeElement(numbers, 2);
        System.out.println(Arrays.toString(numbers));
    }

    public static int[] removeElement(int[] array, int index) {
        if (index < 0 || index > array.length - 1) {
            // System.err.println("Invalid Index: " + index);
            System.exit(0);
        }
        int[] result = new int[array.length - 1];

        int j = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                continue;
            }
            result[j++] = array[i];
        }
        return result;
    }
}
