package day26_CustomMethodsPractice;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 3, 3, 4, 5, 6, 7, 7, 5, 4, 3, 5, 6, 7, 8};

        int n = frequencyOfElement(arr, 4);

        System.out.println("n = " + n);

    }



    public static int frequencyOfElement(int[] array, int element) {
        int count = 0;
        for (int each : array) {
            if (each == element) {
                count++;
            }
        }

        return count;

    }
}
