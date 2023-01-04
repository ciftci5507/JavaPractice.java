package day13_String;

import java.util.Scanner;

public class CheckWords {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String validUserName = "Cydeo",
                validPassword = "WoodenSpoon";

        System.out.println("Enter your username");

        String username = scanner.nextLine();

        System.out.println("Enter your password");

        String password = scanner.nextLine();

        if (username.equals(validUserName) && password.equals(validPassword)) {
            System.out.println("Logged in");
        } else {
            System.out.println("Incorrect username or password!");
        }

        scanner.close();

    }
}
/*
You are writing a code for the log-in function of the Cybertek Application,
assume that your credentials are:
                    username: Cydeo
                    password: WoodenSpoon

        Ask the user to enter their credentials.
        If credentials are matched, your program should print "Logged in."
        otherwise print "Incorrect username or password" as error message

    	Hints: 	In order to login, both username and password MUST be correct
    			you will need to use equals() method

 */