package day08_IfStatements;

import java.util.Locale;

public class GradeReport {
    public static void main(String[] args) {

        int score = 63;

        boolean a = score >= 90 && score <= 100,
                b = score >= 80 && score <= 89,
                c = score >= 70 && !a && !b;
        boolean d = !a && !b && !c && score >=60;
        boolean f = !a && !b && !c && !d;

        if (a){
            System.out.println("Excellent");
        }

        if (b){
            System.out.println("Great");
        }

        if (c){
            System.out.println("Good");
        }

        if (d){
            System.out.println("Passed");
        }

        if (f){
            System.out.println("Failed");
        }


    }
}
