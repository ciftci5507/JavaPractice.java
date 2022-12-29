package day21_ForEachLoop;

import java.util.Arrays;

public class DescendingArray_Task {

    public static void main(String[] args) {

        int[] arr1 = {3, 5, 1, 6, 7, 84, 3, 6};

        Arrays.sort(arr1);

        int[] descendingArr = new int[arr1.length];

        for (int i = 0, j = arr1.length - 1; i < descendingArr.length && j >= 0; j--, i++) {
            descendingArr[i] = arr1[j];
        }
        System.out.println(Arrays.toString(descendingArr));

    }
}
