package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {

        String firstName = "Cydeo";
        String secondName = "School";
        int age = 45;
        String message= "to make some GREAT things... ";

        String fullName = firstName + " " + secondName;

        System.out.println(fullName);

        // to make some great things

        System.out.println(message + fullName);

        // full name and age

        System.out.println(fullName + " is " + age + " years old.");
    }
}
