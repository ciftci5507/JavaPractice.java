package day11_Switch_Scanner;

public class NumberOfDays {
    public static void main(String[] args) {

        int year = 2000;
        int number = 2;

        if (number >= 1 && number <= 12) { //1- 12

            switch (number) {
                case 2:
                    if (year % 4 == 0) {
                        System.out.println("29 days");
                    } else {
                        System.out.println("28 days");
                    }
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("30 days");
                    break;
                default:
                    System.out.println("31 days");
            }
        } else {
            System.out.println("Invalid Number");
        }

        System.out.println("\n===========================================\n");


        int year2 = 2000;
        int number2 = 6;
        String result;

        if (number2 >= 1 && number2 <= 12) { //1- 12

            switch (number2) {
                case 2:
                    result = (year2 % 4 == 0) ? ("29 days") : "28 days";
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    result = "30 days";
                    break;
                default:
                    result = "31 days";
            }
        } else {
            result = "Invalid Number";
        }

        System.out.println("There are " +  result   + " in " + number2+ ". month of a year.");

    }

}
