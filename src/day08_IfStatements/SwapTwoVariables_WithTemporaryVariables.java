package day08_IfStatements;

public class SwapTwoVariables_WithTemporaryVariables {
    public static void main(String[] args) {

        int a = 10;
        int b = 15;

        System.out.println("a = " + a);
        System.out.println("b = " + b);

        System.out.println("==========================");

        a = b;
        b = a;

        System.out.println(a);
        System.out.println(b);

    }

}
