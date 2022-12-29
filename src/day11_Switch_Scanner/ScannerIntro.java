package day11_Switch_Scanner;

import java.util.Scanner;

public class ScannerIntro {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter an integer:");

        int intData = input.nextInt();

        System.out.println("Enter a decimal:");

        double douData = input.nextDouble();

        System.out.println(intData);
        System.out.println(douData);
        System.out.println("Multiplication: " + (intData * douData));

        input.close(); // closes Scanner method
    }


}
