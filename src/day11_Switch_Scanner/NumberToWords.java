package day11_Switch_Scanner;

public class NumberToWords {

    public static void main(String[] args) {

        int number = -17;

        String result = (number >= 0 && number <= 9) ?
                (number == 0) ? "Zero" : (number == 1) ? "One" : (number == 2) ? "Two" : (number == 3) ? "Three" :
                        (number == 4) ? "Four" : (number == 5) ? "Five" : (number == 6) ? "Six" : (number == 7) ? "Seven"
                                : (number == 8) ? "Eight" : "Nine"
                : "Invalid Number";

        System.out.println("result = " + result);

        System.out.println("================================");

        int num2 = 3;
        String withWords;

        switch (num2) {
            case 1:
                withWords = "One";
                break;
            case 2:
                withWords = "Two";
                break;
            case 3:
                withWords = "Three";
                break;
            case 4:
                withWords = "Four";
                break;
            case 5:
                withWords = "Five";
                break;
            case 6:
                withWords = "Six";
                break;
            case 7:
                withWords = "Seven";
                break;
            case 8:
                withWords = "Eight";
                break;
            case 9:
                withWords = "Nine";
            default:
                withWords = "All Others";
        }


        System.out.println("withWords = " + withWords);
    }


}
