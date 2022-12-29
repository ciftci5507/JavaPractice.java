package day10_NestedIf;

import java.util.SplittableRandom;

public class GradeReport2 {
    public static void main(String[] args) {

        /*
        90 100 =excellent
        80 89 = great
        70 79 = good
        60 69 = passed
        0 59 = failed


        int score = 75;

        if (score >= 0 && score <= 100) { // if the score is valid
            //5 possibilities

            if (score >= 90) {//false: score < 90
                System.out.println("Excellent");
            } else if (score >= 80) {//false: score < 80
                System.out.println("Great");
            } else if (score >= 70) {//false: score < 70
                System.out.println("Good");
            } else if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {// if score is not valid
            System.out.println("Invalid Score");
        }


        System.out.println("====================================");


        String result = ""; // temporary

        if (score >= 0 && score <= 100) { // if the score is valid
            //5 possibilities

            if (score >= 90) {//false: score < 90
                result = "Excellent";
            } else if (score >= 80) {//false: score < 80
                result = "Great";
            } else if (score >= 70) {//false: score < 70
                result = "Good";
            } else if (score >= 60) {
                result = "Passed";
            } else {
                result = "Failed";
            }
        } else {// if score is not valid
            result = "Invalid Score";
        }

        System.out.println(result);
*/
        int score = 443;
        System.out.println("======================================");

        String result5 = (score >= 0 && score <= 100) ? (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score
                >= 60) ? "Passed" : "Failed" : "Invalid Score";

        System.out.println(result5);

        System.out.println("===========================");


        String result6 = "";

        if (score >= 0 && score <= 100) {
             result6 = (score >= 90) ? "Excellent" : (score >= 80) ? "Great" : (score >= 70) ? "Good" : (score >= 60) ? "Passed" : "Failed";
        } else {
             result6 = "Invalid";
        }

        System.out.println(result6);


    }

}
