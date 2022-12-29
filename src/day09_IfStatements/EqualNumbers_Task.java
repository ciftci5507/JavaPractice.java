package day09_IfStatements;

public class EqualNumbers_Task {

    public static void main(String[] args) {

        int num1 = 23,
                num2 = 12,
                num3 = 22;

        if (num1 == num2 && num2 == num3) {
            System.out.println("all equal");
        } else if (num1 == num2 && !(num2 == num3)) {
            System.out.println("num1&num2 are equal");
        } else if (!(num1 == num2) && num2 == num3) {
            System.out.println("num2&num3 are equal");
        } else if (num1 == num3 && !(num1 == num2)) {
            System.out.println("num1&num3 are equal");
        } else {
            System.out.println("none of them are equal");
        }

    }
}

/*
Create a class called EqualNumbers,
and write a program that
can check the equality of the three given numberrs
	 			declare 3 numbers n1, n2, n3
	 			if all are equal ==> print "all equal"
	  			if only n1 and n2 are equal  =>print  "n1&n2 are equal"
	   			if only n2 and n3 are equal ==>print "n2&n3 are equal"
	   			if only n3 and n1 are qual ==>print "n3&n1 are equal"
				if none of them are euqal ==> none of them are equal

 */