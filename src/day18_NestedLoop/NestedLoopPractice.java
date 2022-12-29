package day18_NestedLoop;

import java.util.Scanner;

public class NestedLoopPractice {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            System.out.println("Enter your age:");
            int age = scanner.nextInt();

            while (!(age >= 1 && age <= 120)) {
                System.err.println("Invalid Entry, Please re-enter your age");
                age = scanner.nextInt();
            }

            System.out.println("Would you like to continue?");
            String a = scanner.next().toLowerCase();

            while (!(a.equals("yes") || a.equals("no"))) {
                System.err.println("Invalid Entry, Please re-enter. Would you?");
                a = scanner.next().toLowerCase();
            }
            if (a.equals("no")) {
                break;
            }
        }

        scanner.close();

    }
}

