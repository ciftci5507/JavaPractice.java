package day23_CustomMethods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

        int num1 = 5;

        oddOrEven(num1);
        oddOrEven(8);

        System.out.println();

        ageOfPerson(1987);

        System.out.println();

        numbersInRage(32,57);

    }

    public static void oddOrEven(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is a even number");
        } else {
            System.out.println(number + " is a odd number");
        }
    }

    public static void ageOfPerson(int birthYear) {

        int age = 2021 - birthYear;

        System.out.println("Your age is: " + age);
    }

    public static void numbersInRage(int x, int y) {
        for (int i = x + 1; i < y; i++) {
            System.out.print(i + " ");
        }
    }
}
