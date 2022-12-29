package day24_CustomMethods_Return;

public class BreakfastTask {

    public static void main(String[] args) {

        initials("cydeo", "School");

        System.out.println("--------------------");

        domain("cydeo.school@cydeo.com");

        System.out.println("---------------------");

        String[] emails = {"josh@gmail.com", "jim@yahoo.com",
                "elminur@cydeo.com", "gulsen@gmail.com"};

        for (String email : emails) {
            domain(email);
        }

        System.out.println("---------------------");

        nameOfMonth(3);
    }

    public static void initials(String firstName, String lastName) {

        String initial = firstName.charAt(0) + "." + lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println(initial);

    }

    public static void domain(String email) {
        String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    public static void nameOfMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {
            name = (number == 1) ? "Jan" : (number == 2) ? "Feb" : (number == 3) ?
                    "Mar" : (number == 4) ? "Apr" : (number == 5) ? "May" : (number == 6) ?
                    "Jun" : (number == 7) ? "July" : (number == 8) ? "Aug" : (number == 9) ?
                    "Sep" : (number == 10) ? "Oct" : (number == 11) ?
                    "Nov" : "Dec";
        } else {
            name = "Invalid";
        }
        System.out.println("Month name = " + name);
    }


}
