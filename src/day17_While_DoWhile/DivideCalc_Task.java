package day17_While_DoWhile;

public class DivideCalc_Task {

    public static void main(String[] args) {

        int dividend = 23,
                divisor = 2,
                quotient = 0;

        while (dividend >= divisor) {
            dividend -= divisor;
            quotient++;
        }

        System.out.println("remainder = " + dividend);
        System.out.println("quotient = " + quotient);

    }
}
/*
Write a program that
 can divide two positive numbers
  without using / (division) and * (multiplication) operators.
 */