package day13_String;

import java.util.Scanner;

public class Initials {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your first name");
        String firsName = scanner.next(); //"Java"

        System.out.println("Enter your name last name");
        String lastName= scanner.next();

        char f = firsName.charAt(0);
        char l = lastName.charAt(0);

        String initial = f+"."+l;

        System.out.println("initial = " + initial);

    }

}
