package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

        int n = -43;

        if(n>0){
            System.out.println("Positive");
        } else if (n < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }

        System.out.println("================================");

        boolean positive = n>0,
                negative = n<0,
                zero = n ==0;

        if (positive){
            System.out.println('P');
        } else if (negative) {
            System.out.println('N');
        } else {
            System.out.println('0');
        }



    }

}


//if and else statement must never be applied for the situation that requires more than two stuation.!!!!!!!!!