package day12_Scanner;

import java.util.Scanner;

public class MilesToKM_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter miles:");

        double miles = scanner.nextDouble();

        double kM = miles * 1.609;

        System.out.println(miles + " miles equal to " + kM + " kilometers.");

        scanner.close();


    }
}

/*
 Write a program that can convert Miles to KM
            Ex:
                Enter miles:
                10.0

                output:
                10.0 miles equal to 16.09 kilometers

 */