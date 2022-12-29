package day16_ForLoopStringPractice;

public class Reverse {
    public static void main(String[] args) {

        String str = "I Love Java, it is a fun programming language";
        String result = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            result += str.charAt(i);
        }

        System.out.println(result);

    }
}
