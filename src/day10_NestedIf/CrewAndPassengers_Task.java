package day10_NestedIf;

public class CrewAndPassengers_Task {

    public static void main(String[] args) {

        int numOfPeople = 100;
        int crew = 0, passenger = 0;
        String result = "";

        if (numOfPeople == 50 || numOfPeople == 75 || numOfPeople == 100) {
            if (numOfPeople == 50) {
                crew = 20;
                passenger = 30;
                result = crew + " crew and " + passenger + " passenger";
            } else if (numOfPeople == 75) {
                crew = 25;
                passenger = 50;
                result = crew + " crew and " + passenger + " passenger";
            } else {
                crew = 30;
                passenger = 70;
                result = crew + " crew and " + passenger + " passenger";
            }
        } else {
            result = "Not valid!";
        }

        System.out.println(result);

    }

}

/*
Create a class called CrewAndPassangers,
Given a number of people on the ship (int number),
 determine how many need to be crew members
 and how many can be passengers.
 Print how many of each type there should be.

            Total: 50  ====> 20 crew, 30 passengers
            Total: 75  ====> 25 crew, 50 passengers
            Total: 100 ====> 30 crew, 70 passengers
            Any other number of people on the ship is not valid

            NOTE: MUST USE NESTED IF. DO NOT USE MORE THAN ONE PRINT STATEMENT
 */