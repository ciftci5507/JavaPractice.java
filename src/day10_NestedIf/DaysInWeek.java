package day10_NestedIf;

public class DaysInWeek {
    public static void main(String[] args) {


        int n = 3;
        String day;

        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Saturday";
        } else if (n == 7) {
            day = "Sunday";
        } else {
            day = "Invalid";
        }

        System.out.println("day = " + day);


        System.out.println("--------------------------------------------");

        String result = (n == 1) ? "Monday" : (n == 2) ? "Tuesday" : (n == 3) ? "Wednesday" : (n == 4) ? "Thursday"
                : (n == 5) ? "Friday" : (n == 6) ? "Saturday" : "Sunday";

        System.out.println(result);

        System.out.println("============================================");

        int number = 5;

       String name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April"
                : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" : (number == 8) ? "August"
                : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        System.out.println(name);



    }

}
