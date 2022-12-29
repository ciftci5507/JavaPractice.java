package day13_String;

import java.util.Scanner;

public class FirstAndLastChar_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence");

        String sentence = scanner.nextLine();

        System.out.println(sentence.charAt(0) + " " + sentence.charAt(sentence.length() - 1));

        scanner.close();
    }
}
/*
1. write a program that asks user to enter a sentence.
                then print the first & last characters of the sentence
 */