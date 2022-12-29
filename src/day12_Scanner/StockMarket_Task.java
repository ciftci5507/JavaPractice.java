package day12_Scanner;

import java.util.Scanner;

public class StockMarket_Task {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("how many total shares do you have already?");

        int totalShare = scanner.nextInt();

        if (totalShare <= 0) {
            System.exit(0);
        }

        System.out.println("how much is your total value in the stock market?");

        double totalValue = scanner.nextDouble();

        System.out.println("which company do you have the most shares in?");

        scanner.nextLine();
        String companyOfShare = scanner.nextLine();

        System.out.println("Your total stock market holding is $" + totalValue + " which is made up of " +
                totalShare + " shares. " + companyOfShare + " is your company holdings.");
    }
}
/*

7. StockMarket task:
        - Ask the user how many total shares they have already? (int)
            -> If the user gives 0 or give a negative number none of the rest condition should be executed

        - Ask the user how much their total value in the stock market is (double)
        - Ask the user to enter the name of the company they have the most shares in (String, multiple words)

        - Print in the following format:
            Ex:
                inputs: 100, 25000, Apple INC

            "Your total stock market holding is $25000 which is made up of 100 shares. Apple INC is your company holdings"

 */