package day09_IfStatements;

public class OxygenTank_Task {

    public static void main(String[] args) {

        int tankLevel = 65;
        String indicator = "";

        if (tankLevel > 90)
            indicator = "Your tank is full!";
        else if (tankLevel > 80)
            indicator = "Still okay";
        else if (tankLevel > 70)
            indicator = "Don't go too far";
        else if (tankLevel > 60)
            indicator = "Start to head back";
        else
            indicator = "Be careful! Now you at at 50%";

        System.out.println(indicator);
    }
}
/*

4. Create a class called OxygenTank.
You are diving in the ocean.
Your oxygen tank has a certain level (number)
and you must print a message based on the level:

                Above 90 -  Your tank is full
                Above 80 -  Still okay
                Above 70 -  Don't go too far
                Above 60 -  Start to head back
                Above 50 -  Be careful now you at at 50%

                USE ONE PRINT STATEMENT ONLY

 */