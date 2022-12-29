package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArray2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] arr3 = {7, 8, 9};

        int[][] arr2D = {arr1, arr2, arr3};

        int[][][] arr3D = {{arr2, arr1}, arr2D};

        System.out.println(Arrays.deepToString(arr3D));

        System.out.println(Arrays.deepToString(arr2D));

        for (int[][] dimen2 : arr3D) {
            for (int[] dimen1 : dimen2) {
                for (int element : dimen1) {
                    System.out.print(element + " ");
                }
            }
        }

    }
}
