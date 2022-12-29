package day13_String;

import java.util.Scanner;

public class StringMethod_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scanner.nextLine();

        if (word.isEmpty()) {
            System.out.println("string is empty");
        } else if (word.length() <= 3) {
            System.out.println(word);
        }else {
            System.out.println(word.substring(word.length() - 3));
        }
        scanner.close();
    }
}
/*

5. Write a method that asks user to enter a string.
        if the string is empty, print: string is empty
        if the string has more than 3 characters, print the last three characters
        if the string has less than or equal 3 characters, print the string itself

 */