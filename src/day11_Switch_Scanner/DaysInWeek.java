package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {

        int number = 2;

        /*
        if (number==1){
            System.out.println("Monday");
        }

         */

        switch (number) {//1,2,3,4,5,6,7
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Ooppss");

        }


    }
}
