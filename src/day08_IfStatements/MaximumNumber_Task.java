package day08_IfStatements;

public class MaximumNumber_Task {

    public static void main(String[] args) {

        int num1 = 250;
        int num2 = 170;

        if (num1 > num2) {
            System.out.println(num1 + " is maximum number");
        } else if (num2 > num1) {
            System.out.println(num2 + " is maximum number");
        } else {
            System.err.println("Equal!");
        }

    }
}

/*
	3. Write a program that can print the maximum number between two numbers,
	 if both are equal then print Equal

			Ex:
				n1= 100, n2 = 200;

			output:
				200 is maximum number

 */