package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice_NextLine {


    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);

        System.out.println("Enter your full name");
        String fullName = input.nextLine();

        System.out.println("Enter your Programming Language");
        String programming = input.nextLine();

        System.out.println("Enter your age");
        int age = input.nextInt(); //24

        System.out.println("Enter your grade");
        int grade = input.nextInt();

        //input.nextLine();

        System.out.println("Ener your school name:");
        String schoolName = input.nextLine();

        System.out.println("fullName = " + fullName);
        System.out.println("programming = " + programming);
        System.out.println("age = " + age);
        System.out.println("grade = " + grade);
        System.out.println("schoolName = " + schoolName);

        input.close();

    }
}
