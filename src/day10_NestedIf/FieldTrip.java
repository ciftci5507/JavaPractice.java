package day10_NestedIf;

public class FieldTrip {

    public static void main(String[] args) {

        int grade = 3;
        String location;
        int groupNumber;
        String teacher="default";
        if (grade >= 1 && grade <= 2) {

            if (grade == 1) {
                location = "Apple orchard";
                groupNumber = 3;
                teacher = "Ms. Smith";
            } else {
                location = "Zoo";
                groupNumber = 7;
                teacher = "Mr. Lee";
            }
        } else {
            System.out.println("Invalid Grade");
        }
        System.out.println(teacher);

    }

}
