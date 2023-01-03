package day15_String_ForLoop;

public class EvenNumbers_Task {

    public static void main(String[] args) {

        int sum = 0;
        for (int i = 0; i < 101; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }

}
/*
Write a program that can return the sum of even numbers between 1 to 100
 */