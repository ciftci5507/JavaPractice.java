package day18_NestedLoop;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter your user name:");
        String username = scanner.next();

        System.out.println("Enter you password");
        String password = scanner.next();

        if ((username.equals("Cydeo") && password.equals("Cyd123"))) {
            System.out.println("Logged in");
        } else {
            for (int i = 0; i < 3; i++) {
                System.out.println("Incorrect username or password");
                System.out.println("Enter your user name:");
                username = scanner.next();
                System.out.println("Enter you password");
                password = scanner.next();
                if ((username.equals("Cydeo") && password.equals("Cyd123"))) {
                    System.out.println("Logged in");
                    break;
                }
            }
        }

        if (!(username.equals("Cydeo") && password.equals("Cyd123"))) {
            System.out.println("Your account is locked,  Please contact with support team");
        }

        scanner.close();


    }
}
