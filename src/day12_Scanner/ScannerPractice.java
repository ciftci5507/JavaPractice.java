package day12_Scanner;

//import java.util. // wild import

import java.util.Scanner; // regular import

public class ScannerPractice {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 to 7");

        int num = scan.nextInt();

        String result;

        if (num >= 1 && num <= 7) {
            switch (num) {
                case 1:
                    result = "Monday";
                    break;
                case 2:
                    result="Tuesday";
                    break;
                case 3:
                    result="Wednesday";
                    break;
                case 4:
                    result= "Thursday";
                    break;
                case 5:
                    result="Friday";
                    break;
                case 6:
                    result="Saturday";
                default:
                    result = "Sunday";
            }
        } else {
            result = "Invalid Number";
        }

        System.out.println("The day is: " + result);

        scan.close();


    }
}
