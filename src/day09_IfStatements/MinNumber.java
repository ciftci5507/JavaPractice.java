package day09_IfStatements;

public class MinNumber {
    public static void main(String[] args) {

        int n1 = 300,
                n2 = 200;

        boolean n1IsMin = n1 < n2;
        boolean n2IsMin = n2 < n1;
        boolean equal = n1 == n2;

        if (n1IsMin) { //if n1 is the min number
            System.out.println(n1 + " is th minimum number");
        }

        if (n2IsMin) { //if n2 is the min number
            System.out.println(n2 + " is th minimum number");
        }

        if (equal) { //if n1 is equal to n2
            System.out.println("Equal");
        }
    }
}
