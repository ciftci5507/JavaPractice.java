package day10_NestedIf;

public class Loans_Task {

    public static void main(String[] args) {

        double salary = 12000;
        int creditScore = 650;
        String loan = "";

        loan = (salary > 60000 && creditScore >= 650) ?
                "loan is avaible" : "loan is NOT avaible";

        System.out.println(loan);
    }
}
/*
6. Create a class called Loans, Given two variables salary and credit score,
 use those given info to determine if you can get a loan.

                To be approve for the loan, print: "Loan Approved":
                        Salary: above 60,000
                        Credit Score: above 650

                    Otherwise print: "Loan Denied"

              NOTE: MUST USE TERNARY.
 */