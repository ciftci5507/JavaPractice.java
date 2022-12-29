package day08_IfStatements;

public class LogicalOperators {
    public static void main(String[] args) {
        String name = "Steven";
        int age = 13;
        String citizen = "USA";

        boolean isEligible = age >= 18 && citizen == "USA";

        System.out.println(name + " is eligible to vote: " + isEligible);

        System.out.println("0000000000000000000000000000000000000000000000000");

        String name2 = "Josh";
        int creditScore = 720,
                age2 = 23,
                income = 6000;

        boolean isEligible2 = creditScore >= 700 && age2 >= 21 && income >= 6000;

        System.out.println(name2 + " is eligible for loan: " + isEligible2);


        System.out.println("------------------------------------------------------");

        String student = "Anna";

        double gpa = 3.5;

        int familyIncome = 40000;

        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;

        System.out.println(student + " is eligible for scholarship: " + isEligible5);

        System.out.println("----------------------------");

        boolean result2 = true;

        System.out.println("result2 = " + result2);

        boolean result3 = !result2;

        System.out.println("result3 = " + result3);


        System.out.println("00000000000000000000000000000000");
        
        int score = 55;
        boolean passed= score >= 60,
                failed= !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }

}
