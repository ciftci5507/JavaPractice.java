package day15_String_ForLoop;

public class Alphabet {
    public static void main(String[] args) {

        //A-Z ==> 65 - 90


        for (char i = 65; i <= 90; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (char i = 'A'; i <= 'Z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();

        for (int x = 65; x <= 90; x++) {
            System.out.print((char) x + " "); //CHAR X
        }

        System.out.println();

        for (char i = 'a'; i <= 'z'; i++) {
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println("---------------------------");

        for (char i = 'z'; i >= 'a'; i--) {
            System.out.print(i + " ");
        }

        //for (char i = 1; i <= 40000; i++) {
        //    System.out.println(i);
       // }

        char ch = '»';

        System.out.println(ch);

    }


}
