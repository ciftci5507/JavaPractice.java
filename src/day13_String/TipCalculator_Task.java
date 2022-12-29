package day13_String;

import java.util.Scanner;

public class TipCalculator_Task {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Is split? Yes or No!");

        String isSplit = scanner.next().toLowerCase();

        System.out.println("Enter the amount of people");
        int numberOfPeople = scanner.nextInt();

        System.out.println("Enter the check amount");
        double checkAmount = scanner.nextInt();

        System.out.println("How was the service quality?");
        String serviceQuality = scanner.next().toLowerCase();

        double totalTip = 0;

        switch (serviceQuality) {
            case "poor":
                totalTip = checkAmount * 5 / 100;
                break;
            case "fair":
                totalTip = checkAmount * 10 / 100;
                break;
            case "good":
                totalTip = checkAmount * 15 / 100;
                break;
            case "great":
                totalTip = checkAmount * 20 / 100;
                break;
            case "excellent":
                totalTip = checkAmount * 25 / 100;
            default:
                System.out.println("please re-enter");

        }
        if (isSplit.equals("yes")) {
            System.out.println("Number of people entered: " + numberOfPeople);
            System.out.println("Total to pay $" + checkAmount);
            System.out.println("Total tip $" + totalTip);
            System.out.println("Total per person $" + (checkAmount / numberOfPeople));
            System.out.println("Tip per person $" + (totalTip / numberOfPeople));
        }else {
            System.out.println("Total to pay $" + checkAmount);
            System.out.println("Total tip $" + totalTip);
            System.out.println("Tip per person $" + (totalTip / numberOfPeople));
        }
    }
}
/*

2. Create a class called TipCalculator,
 write a program for a tip calculator.
There will be different service quality benchmarks
 that will determine the tip given.
There will also the ability to calculate based on
 the number of people in the party and
 if there is a split of the bill or not.

	Poor = 5%, Fair = 10%, Good = 15%, Great = 20%, Excellent = 25%

	The program should display the following information based on the user input:

	Split or No split (Yes or No),  Number of people entered: (number)
	(each person = & in output) Check amount: (number) Service Quality:
	(String) Total to pay: Total tip: Total per person: Tip per person:

	Ex:
		Split or No split (Yes or No)?
		Yes
		Enter the number of people
		4
		Enter the check amount:
		476
		How was the service quality? (Excellent/Great/Good/Fair/Poor)
		Excellent

		output:
			Number of people entered: 4
			Total to pay: 595.0
			Total tip: 119.0
			Total per person: 148.75
			Tip per person: 29.75

	HINT: you will need to use .equals() method

 */