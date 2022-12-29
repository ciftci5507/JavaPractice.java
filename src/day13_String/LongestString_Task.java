package day13_String;

import java.util.Scanner;

public class LongestString_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a sentence");

        String firstSentence = scanner.nextLine();

        System.out.println("Please enter another sentence");

        String secondSentences = scanner.nextLine();

        if (firstSentence.length() > secondSentences.length()) {
            System.out.println(firstSentence + " is the longest sentence");
        } else {
            System.out.println(secondSentences + " is the longest sentence");
        }

        scanner.close();

    }
}
