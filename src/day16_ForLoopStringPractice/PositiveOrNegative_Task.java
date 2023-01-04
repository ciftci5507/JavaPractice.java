package day16_ForLoopStringPractice;

import java.util.Scanner;

public class PositiveOrNegative_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int positive = 0;
        int negative = 0;

        for (int i = 0; i < 5; i++) {
            System.out.println("Please enter a number");
            int num = scanner.nextInt();
            if (num < 0) {
                negative++;
            } else {
                positive++;
            }
        }

        System.out.println(positive + " positive and " + negative + " negative");

        scanner.close();
    }
}
/*
Write a program that asks user to enter number for 5 times,
 and print how many positive and negative numbers user entered
			Ex:
				Inputs:
					10
					20
					-1
					0
					3

				Output:
					3 positive and 1 negative
 */