package day08_IfStatements;

public class SchoolType_Task {

    public static void main(String[] args) {

        String name = "Sandra";
        byte age = 19;

        if (age > 0 && age < 6) {
            System.out.println(name + " is at elementary school");
        } else if (age > 5 && age < 9) {
            System.out.println(name + " is at middle school");
        } else if (age > 8 && age < 13) {
            System.out.println(name + " is at high school");
        } else if (age > 12 && age < 17) {
            System.out.println(name + " is at collage");
        } else if (age > 16 && age < 19) {
            System.out.println(name + " is at grad school");
        } else {
            System.out.println(name + " is over 18 years old");
        }

    }
}









/*
	2.  Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

        	Assume that the given number is 1 ~ 18
 */