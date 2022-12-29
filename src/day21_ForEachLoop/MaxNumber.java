package day21_ForEachLoop;

public class MaxNumber {

    public static void main(String[] args) {

        int[] numbers = {10, 50, 30, 40, 60, 80, 90};
        int max = numbers[0];

        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }

        System.out.println(max);

        int sum = 0;
        for (int each : numbers) {
            sum +=each;
        }
        System.out.println(sum);

        System.out.println(sum/ (numbers.length));

    }
}
