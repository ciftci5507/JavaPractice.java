package day13_String;

import java.util.Scanner;

public class ThreeLetterSwitch_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a three letter word");

        String word = scanner.next();

        if (word.length() == 3) {
            if (word.charAt(1) == 'a') {
                System.out.println("Cool word");
            }else{
                System.out.println("Okay word");
            }
        } else if (word.length() < 3) {
            System.out.println("Word is too short");
        }else {
            System.out.println("Word is too long");
        }

    }
}
