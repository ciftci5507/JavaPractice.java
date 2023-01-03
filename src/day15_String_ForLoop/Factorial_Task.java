package day15_String_ForLoop;

public class Factorial_Task {

    public static void main(String[] args) {

        int factNum = 5;
        int resulOfFactorial = 1;
        
        for (int num = factNum; num > 0; num--) {
            resulOfFactorial *= num;
        }

        System.out.println("resulOfFactorial = " + resulOfFactorial);
        
        
        
    }
}
