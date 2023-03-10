package day09_IfStatements;

public class FieldTrip_Task {

    public static void main(String[] args) {

        int grade = 4;
        String location = "";
        int numOfGroup = 0;
        String teacher = "";

        if (grade > 0 && grade < 7) {
            switch (grade) {
                case 1:
                    location = "Apple orchard";
                    numOfGroup = 3;
                    teacher = "Ms. Smith";
                    break;
                case 2:
                    location = "Zoo";
                    numOfGroup = 7;
                    teacher = "Mr. Lee";
                    break;
                case 3:
                    location = "Aquarium";
                    numOfGroup = 5;
                    teacher = "Ms. Wilson";
                    break;
                case 4:
                    location = "Movie theater";
                    numOfGroup = 2;
                    teacher = "Ms. Reyes";
                    break;
                case 5:
                    location = "Museum";
                    numOfGroup = 5;
                    teacher = "Ms. Lela";
                    break;
                default:
                    location = "Six Flags";
                    numOfGroup = 8;
                    teacher = "Mr. Watt";
            }
            System.out.println("grade = " + grade);
            System.out.println("location = " + location);
            System.out.println("numOfGroup = " + numOfGroup);
            System.out.println("teacher = " + teacher);
        } else {
            System.out.println("Invalid");
        }

    }
}
/*

7. Create a class called FieldTrip.
Your school goes on a Field trip each year.
The place you go will be based on your grade.
Given a variable gradeNumber (1-6)
figure out the details of your field trip.
Print the information at the end.

    Data based on grade:

        grade - 1
        location -  Apple orchard
        number of groups - 3
        teacher in charge - Ms. Smith

        grade - 2
        location - Zoo
        number of groups - 7
        teacher in charge - Mr. Lee

        grade - 3
        location - Aquarium
        number of groups - 5
        teacher in charge - Ms. Wilson

        grade - 4
        location - Movie theater
        number of groups - 2
        teacher in charge - Ms. Reyes

        grade - 5
        location - Museum
        number of groups - 5
        teacher in charge - Ms. Lela

        grade - 6
        location - Six Flags
        number of groups - 8
        teacher in charge - Mr. Watt
 */