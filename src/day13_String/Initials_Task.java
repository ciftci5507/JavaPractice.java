package day13_String;

import java.util.Scanner;

public class Initials_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your full name");

        String fullName = scanner.nextLine().toUpperCase();

        System.out.println(fullName.charAt(0) + ". " +
                fullName.charAt(fullName.indexOf(" ") + 1));

        scanner.close();
    }
}

/*
4. write a program that can return the initials of the user
            ex:
                cybertek
                school

            output:
                C.S

        Note: Pay attention to the example output
 */
