package day16_ForLoopStringPractice;

public class UniqueCharacters {
    public static void main(String[] args) {

        String str = "AABBCCCWCCDEEFFF";

        for (int i = 0; i <= str.length() - 1; i++) {
            char ch = str.charAt(i);
            if (str.indexOf(ch) == str.lastIndexOf(ch)) {
                System.out.println(ch + " is unique!");
            }
        }


    }

}
