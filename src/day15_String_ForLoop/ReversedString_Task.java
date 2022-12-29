package day15_String_ForLoop;

public class ReversedString_Task {

    public static void main(String[] args) {

        String str = "Java is a fun language!";
        String reversedString = "";

        for (int i = str.length()-1; i >=0 ; i--) {
            reversedString += str.charAt(i);
        }

        System.out.println(reversedString);

    }
}




/*
	7. Write a program that can reverse any given string

			Ex:
				input:
					Wooden Spoon

				output:
					noopS nedooW
 */