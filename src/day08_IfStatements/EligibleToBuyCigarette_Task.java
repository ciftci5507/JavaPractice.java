package day08_IfStatements;

public class EligibleToBuyCigarette_Task {

    public static void main(String[] args) {

        byte age = 15;
        if (age > 18) {
            System.out.println("Age " + age + " is eligible for buying cigarette");
        } else {
            System.err.println("Age " + age + " is NOT eligible for buying cigarette");
        }

    }
}
/*
Tasks:
        1. Given a number (byte) age, write a program that
        can check if the person is eligible to buy Cigarettes

 */
