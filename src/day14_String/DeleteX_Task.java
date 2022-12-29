package day14_String;

import java.util.Scanner;

public class DeleteX_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a word");

        String word = scanner.next();

        if (word.startsWith("x")) {
            System.out.println(word.substring(1));
        }

        scanner.close();
    }
}

/*
    3. Ask user to enter a word.
     If the work starts with x, print the word without x.
                    Input:
                        xcode
                    Output:
                        code
 */
