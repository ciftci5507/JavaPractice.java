package day14_String;

public class ConcatenationWithoutFirstChar_Task {

    public static void main(String[] args) {

        String str1 = "Apple";
        String str2 = "Banana";

        String str3 = str1.substring(1) + str2.substring(1);

        System.out.println(str3);
    }
}

/*
 1. Ask user to enter two words. Print first word without its first character
        then print the second word without its first character.
                Input:
                    apple
                    banana
                Output:
                    ppleanana
 */
