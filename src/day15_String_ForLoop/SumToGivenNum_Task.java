package day15_String_ForLoop;

public class SumToGivenNum_Task {

    public static void main(String[] args) {

        int givenNumber = 50;

        int sum = 0;

        for (int i = 0; i <= givenNumber; i++) {
            sum += i;
        }

        System.out.println(sum);
    }
}
/*
	3. write a program that can calculate
	 the sum of all numbers between 1 to any given number
            ex:
                input: 100
                output: 5050

                input: 50
                output: 1275
 */
