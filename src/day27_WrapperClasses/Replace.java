package day27_WrapperClasses;

import java.util.Arrays;

public class Replace {

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int[] arr2 = replaceElement(arr1, 2, 55);

        System.out.println(Arrays.toString(arr2));

    }

    public static int[] replaceElement(int[] array, int index, int newElement) {
        array[index] = newElement;
        return array;
    }
}
       