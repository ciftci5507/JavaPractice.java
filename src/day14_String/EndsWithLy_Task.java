package day14_String;

import java.util.Scanner;

public class EndsWithLy_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scanner.next();

        if (word.endsWith("ly")) {
            System.out.println("really???");
        } else {
            System.out.println("never mind");
        }

        scanner.close();
    }
}

/*
2. ask the user to enter a word.
 if the word ends with "ly", print "really???",
  otherwise, print "never mind"
 */
