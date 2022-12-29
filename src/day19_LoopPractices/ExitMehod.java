package day19_LoopPractices;

public class ExitMehod {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            if ((i == 3)) {
                //break
                //continue;
                System.exit(0); //terminates the entire program
            }

            System.out.println(i);
        }

        System.out.println("Wooden Spoon");






    }
}
