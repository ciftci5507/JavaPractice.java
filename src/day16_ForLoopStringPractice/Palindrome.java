package day16_ForLoopStringPractice;

import org.w3c.dom.ls.LSOutput;

public class Palindrome {
    public static void main(String[] args) {


        String str = "Level";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        if (str.equalsIgnoreCase(result)){
            System.out.println(str + " is a palindroma");
        }



    }




}
