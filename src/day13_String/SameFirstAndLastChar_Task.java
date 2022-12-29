package day13_String;

import java.util.Scanner;

public class SameFirstAndLastChar_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scanner.nextLine().toLowerCase();

        if (word.charAt(0) == word.charAt(word.length() - 1)) {
            System.out.println("same");
        } else {
            System.err.println("different");
        }

        scanner.close();

    }
}
/*
3. write a program that can
check if the first and last characters of the string are same
            ex:
                level
            output:
                same
 */