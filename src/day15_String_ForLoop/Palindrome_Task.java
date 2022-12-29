package day15_String_ForLoop;

public class Palindrome_Task {

    public static void main(String[] args) {

        String str1 = "Anna";
        String reversed = "";

        for (int i = str1.length()-1; i >=0 ; i--) {
            reversed += str1.toLowerCase().charAt(i);
        }

        if (reversed.equals(str1.toLowerCase())) {
            System.out.println(str1 + " is a palindrome!");
        }else {
            System.err.println(str1 + " is NOT a palindrome!");
        }

    }
}
/*
	8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */