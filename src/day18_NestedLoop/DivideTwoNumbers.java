package day18_NestedLoop;

import java.util.Scanner;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int count = 0;
        System.out.println("Enter a number: ");
        int dividedNum = scanner.nextInt();

        System.out.println("Enter your divisor: ");
        int divisorNum = scanner.nextInt();

        while (dividedNum >= divisorNum) {
            dividedNum -= divisorNum;
            count++;
        }

        System.out.println(count + " with a remainder of " + dividedNum);

        scanner.close();


    }
}
