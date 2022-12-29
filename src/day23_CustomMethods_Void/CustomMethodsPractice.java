package day23_CustomMethods_Void;

public class CustomMethodsPractice {

    public static void main(String[] args) {

        helloWorld5Times();
        System.out.println();
        helloCydeo5Times();
        System.out.println();
        evenNumbers();

    }
    public static void helloWorld5Times() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("Hello World ");
        }
    }
    public static void helloCydeo5Times() {
        System.out.print("Hello Cydeo ");
        System.out.print("Hello Cydeo ");
        System.out.print("Hello Cydeo ");
        System.out.print("Hello Cydeo ");
        System.out.print("Hello Cydeo ");
    }
    public static void evenNumbers() {

        for (int i = 0; i <= 10; i+=2) {
                System.out.print(i + " ");
        }
    }
}

