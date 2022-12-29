package day10_NestedIf;

public class BiggerNum_Task {

    public static void main(String[] args) {

        int n1 = 3, n2 = 6, n3 = 9;

        int biggerNum = 0;

        biggerNum = (n1 > n2 && n2 > n3 || n1 > n3 && n3 > n2) ? n1 :
                (n2 > n1 && n1 > n3 || n2 > n3 && n3 > n1) ? n2 : n3;

        System.out.println("biggerNum = " + biggerNum);


    }
}
/*
5. Create a class called BiggerNum,
 write a program that checks for the bigger of 3 numbers.

        you get 3 int variables with DIFFERENT values: n1 , n2 and n3

            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"

         NOTE: MUST USE TERNARY
 */