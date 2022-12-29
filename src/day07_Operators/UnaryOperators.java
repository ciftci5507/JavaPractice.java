package day07_Operators;

public class UnaryOperators {
    public static void main(String[] args) {

        int num1 = +25;
        int num2 = -25;

        System.out.println(num1 < 0); //false
        System.out.println(num2 < 0); //true

        System.out.println("----------------------------");

        int a = 5;
        ++a; //pre increment: inncreases the value by 1 right away

        System.out.println(a);

        --a; //pre decrement: decreases the value by 1 right away

        System.out.println(a);

        System.out.println("===============================");

        int b = 100;

        System.out.println(++b); //pre increment

        int c = 100;

        System.out.println(c++); // post increment
        System.out.println(c); // 101


        System.out.println("0000000000000000000000000000000000 \n");

        int x = 200;
        System.out.println( --x ); // pre decrement means

        int y = 200;

        System.out.println( y-- ); // post decrement: first passes the current value, then decreases the value by 1
        System.out.println(y);

        System.out.println("\n");

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");

        int m = 25;
        int n = m++;
        int t = n++;

        System.out.println(m);
        System.out.println(n);
        System.out.println(t);

        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!");


        int z = 45;
        System.out.println(++z);
        System.out.println(z++);
        System.out.println(z);

        System.out.println(" \n");

        int q = 30;
        System.out.println(--q); // 29, q = 29 pre decrement
        System.out.println(q--); // 29, q = 28 post decrement
        System.out.println(q); // 28




    }
}
