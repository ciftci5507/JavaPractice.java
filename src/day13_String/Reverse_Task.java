package day13_String;

import java.util.Scanner;

public class Reverse_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");

        String str = scanner.next();

        if (str.length() < 5) {
            System.out.println("Too short!");
        } else if (str.length() > 5) {
            System.out.println("Too long!");
        } else {
            String reversedStr = "";
            for (int i = str.length() - 1; i >= 0; i--) {
                reversedStr += str.charAt(i);
            }
            System.out.println(reversedStr);
        }

        scanner.close();

    }
}
/*
1.  Create a class called Reverse, write a program that will reverse a string.
Your program should reverse a string only 5 characters long.
	If word is shorter, display message: "Too short!".
	If word is longer, display message: "Too long!".
	Otherwise, reverse this word and print out result into the console.
 */