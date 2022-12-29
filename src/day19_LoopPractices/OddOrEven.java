package day19_LoopPractices;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter a number");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }

            System.out.println("Would you like to continue? (yes/no)");
            String a = scanner.next();

            if (!(a.equalsIgnoreCase("yes") || a.equalsIgnoreCase("no"))) {
                System.out.println("Invalid Entry!");
                System.exit(0);
            }


            if (a.equalsIgnoreCase("no")) {
                break;
            }
        }

        scanner.close();

    }
}