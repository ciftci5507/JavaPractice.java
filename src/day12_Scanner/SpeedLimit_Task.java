package day12_Scanner;

import java.util.Scanner;

public class SpeedLimit_Task {

    public static void main(String[] args) {

        int speedLimit = 55;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your speed");
        int currentSpeed = scanner.nextInt();

        if (currentSpeed > speedLimit) {
            int overLimit = currentSpeed - speedLimit;
            System.out.println("You're driving " + overLimit + " mph over the limit. Slow down!");
        }

        scanner.close();

    }
}

/*
Write a program for the speed check.
a variable named speedLimit is given and assigned,
 ask user to enter the current speed,
  if the current speed is over the speedLimit print slow down,
   otherwise do not print anything

        Ex:
            speedLimit = 55;
            Enter current speed:
            105

            output:
            You're driving 50 mph over the limit. Slow down!
 */