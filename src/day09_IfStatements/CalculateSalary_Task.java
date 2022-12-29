package day09_IfStatements;

public class CalculateSalary_Task {

    public static void main(String[] args) {

        double salary = 100000;
        int taxRate = 0;
        boolean isMarried = true;

        if (isMarried) {
            if (salary <= 80000)
                taxRate = 20;
            else if (salary > 80000 && salary < 10000)
                taxRate = 25;
            else if (salary >= 100000 && salary < 130000)
                taxRate = 30;
            else
                taxRate = 35;
            double salaryAfterTax = salary - (salary * taxRate / 100);
            System.out.println("taxRate = " + taxRate);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        } else {
            if (salary <= 80000)
                taxRate = 15;
            else if (salary > 80000 && salary < 10000)
                taxRate = 20;
            else if (salary >= 100000 && salary < 130000)
                taxRate = 25;
            else
                taxRate = 30;

            double salaryAfterTax = salary - (salary * taxRate / 100);
            System.out.println("taxRate = " + taxRate);
            System.out.println("salaryAfterTax = " + salaryAfterTax);
        }
    }
}

/*
2. Write a program that
can calculate the salary after tax
based on the following requirements

                the tax rates are:
                        35% for salary of 130K or more
      			30% for salary of 100K to 130k (excluded)
      			25% for salary of 80K to 100K (excluded)
      			20% for salary less than 80K

                in addition, if the person is married, he/she will pay 5% less tax
 */