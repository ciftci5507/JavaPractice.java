package day25_CustomMethod_Overloading;


import utilities.ArraysUtility;

public class Test2 {

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};

        ArraysUtility.printEachElement(arr1);

        System.out.println("-------------------");

        double[] arr2 = {1.4, 5.7, 8.0};

        ArraysUtility.printEachElement(arr2);

        System.out.println("------------------");

        char[] arr3 = {'A', 'B', 'C', 'D'};

        ArraysUtility.printEachElement(arr3);

        System.out.println("------------------");

        String[] names = {"David", "Elvira", "Ali", "Igor"};

        ArraysUtility.printEachElement(names);

        System.out.println("------------------");

        int[] n1 = {46, 6, 4, 33, 57, 7};

        int max1 = ArraysUtility.max(n1);

        System.out.println("max1 = " + max1);

        System.out.println("------------------");

        double[] n2 = {1.2, 4.3, 2.34, 7.6, 3.5};

        double max2 = ArraysUtility.max(n2);

        System.out.println("max2 = " + max2);

    }
}
