package day09_IfStatements;

public class AgeGroups_Task {

    public static void main(String[] args) {

        int age = 94;

        String ageGroup = (age > 0 && age < 3) ? "Infant" : (age > 2 && age < 6) ? "Toddler" :
                (age > 5 && age < 10) ? "Kid" : (age > 9 && age < 13) ? "Pre-Teenager" :
                        (age > 12 && age < 18) ? "Teenager" : (age > 17 && age < 21) ? "Young Adult" :
                                (age > 20 && age < 40) ? "Adult" : (age > 39 && age < 50) ? "Young Middle-Aged Adult" :
                                        (age > 49 && age < 55) ? "Middle-Aged Adult" : (age > 54 && age < 65) ? "Very Young Senior Citizen" :
                                                (age > 64 && age < 75) ? "Young Senior Citizen" : (age > 74 && age < 85) ? "Senior Citizen" :
                                                        "Old Senior Citizen";
        System.out.println(ageGroup);
    }
}
