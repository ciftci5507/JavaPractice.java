package day10_NestedIf;

public class Grade_Task {

    public static void main(String[] args) {

        char grade = 'G';
        String result;

        if (grade >= 'A' && grade <= 'F') {
            switch (grade) {
                case 'A':
                    result = "excellent";
                    break;
                case 'B':
                    result = "great job";
                    break;
                case 'C':
                    result = "good";
                    break;
                case 'D':
                    result = "passed";
                    break;
                default:
                    result = "failed";
            }
        } else {
            result = "Invalid!";
        }
        System.out.println(result);
    }
}

/*
3. Create a class called Grade,
a char variable named grade is given.
 write a program to print the following messages:

            'A': excellent
            'B': great job
            'C': good
            'D': passed
            'F': failed
            otherwise: invalid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */