package day09_IfStatements;

import java.util.Scanner;

public class NumberToWord_Task {

    public static void main(String[] args) {
/*
        1. Create a class called NumberToWord, and write a java program that
                can convert numbers between 0 ~ 9 to words
        Ex:
        number = 1;

        output:
        One

 */

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Please enter a number between 0-9");
            int number = scanner.nextInt();

            switch (number) {
                case 0:
                    System.out.println("zero");
                    break;
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                default:
                    System.out.println("Invalid number! Please re-enter!");
            }
        }

    }
}
