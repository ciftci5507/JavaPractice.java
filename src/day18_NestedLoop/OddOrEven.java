package day18_NestedLoop;

import java.util.Scanner;

public class OddOrEven {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); //get input

        while (true) {
            System.out.println("Please enter a number");
            int num = scanner.nextInt();

            if (num % 2 == 0) {
                System.out.println("It's a even number");
            } else {
                System.out.println("It's a odd number");
            }

            System.out.println("Would you like to enter another number?");
            String answer = scanner.next().toLowerCase();
            scanner.nextLine();

            while (!(answer.equals("yes") || answer.equals("no"))) {
                System.err.println("re-enter");
                answer = scanner.next().toLowerCase();
                scanner.nextLine();

            }

            if (answer.equals("no")) {
                break;
            }
        }


        //ask would you like to add another num

        //if yes repeat

        // if no print nothing


    }
}
