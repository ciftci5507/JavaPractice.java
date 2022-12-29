package day09_IfStatements;

public class MedianNumber {
    public static void main(String[] args) {

        int a = 134,
                b = 255,
                c = 378;

        boolean aIsMedian = (a > b && a < c) || (a < b && a > c);
        boolean bIsMedian = (b > c && b < a) || (b < c && b > a);
        boolean cIsMedian = (c < a && c > b) || (c > a && c < b);

        if (aIsMedian) { // if a is median
            System.out.println(a + " is median number");
        }

        if (bIsMedian) { // if b is median
            System.out.println(b + " is median number");
        }

        if (cIsMedian) { // if c is median
            System.out.println(c + " is median number");
        }

    }


}
