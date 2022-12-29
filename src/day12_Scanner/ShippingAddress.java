package day12_Scanner;

import java.util.Scanner;

public class ShippingAddress {
    public static void main(String[] args) {

        /*
        full name
        building name
        street name
        city name
        state name
        zip

        =================

        display the shipping address
         */

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name:");
        String fullname = input.nextLine();

        System.out.println("Enter your building number:");
        String building = input.next();

        input.nextLine(); // Enter

        System.out.println("Enter your street name:");
        String street = input.nextLine();

        System.out.println("Enter your city name:");
        String city = input.nextLine();

        System.out.println("Enter your state name:");
        String state = input.next();

        System.out.println("Enter your zip code");
        String zipCode = input.next();


        input.close();

    }

}

