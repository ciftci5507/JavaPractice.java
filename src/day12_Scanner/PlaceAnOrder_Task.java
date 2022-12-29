package day12_Scanner;

import java.util.Scanner;

public class PlaceAnOrder_Task {

    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Enter the product name");

        String productName = scanner1.nextLine();

        System.out.println("Enter the price");

        double price = scanner1.nextDouble();

        System.out.println("Enter the quantity");

        int quantity = scanner1.nextInt();

        System.out.println("Enter your first name");

        String firstName = scanner1.next();

        System.out.println(firstName + ", your order for " + quantity + " " + productName +
                " has been placed. Your total is: $" + price);
    }

}
/*
6. PlaceAnOrder task:
                Ask User to enter the prodcut name (multiple words)
                Ask the user to enter the price  (double)
                Ask the user to enter the quantity (int)
                Ask the user to enter their first name (String, single word)

            Print in the following format:
                Ex:
                    Input: "Apples" , 1.5, 5. "Luke"

                    Output:
                        Luke, your order for 5 Apples has been places. Your total is 7.5.
 */