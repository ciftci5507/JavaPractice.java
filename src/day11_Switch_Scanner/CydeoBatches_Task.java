package day11_Switch_Scanner;

public class CydeoBatches_Task {

    public static void main(String[] args) {

        String cydeoBatch = "EU";

        String output = "";

        if (cydeoBatch.equals("US morning") ||
                cydeoBatch.equals("US evening") ||
                cydeoBatch.equals("EU")) {
            switch (cydeoBatch) {
                case "US morning":
                    output = "\"Class times are 10-5 EST. M, T, Th, F.\"";
                    break;
                case "Us evening":
                    output = "\"Class times are 7-10 EST. M, T, W, Th, S, S\"";
                    break;
                default:
                    output = "\"Class times are  10-5 EST. M, T, W, Th, F.\"";
            }
        } else {
            System.out.println("Invalid Batch");
        }

        System.out.println(output);

    }
}

/*
 Create a class named Cydeo batches. In Cydeo we have three batch types:
 US morning, US evening, EU.
 Depending on a batch type (String) print information about the batch.

       If batch type is US morning ==> print "Class times are 10-5 EST. M, T, Th, F."
       If batch type is US evening ==> print "Class times are 7-10 EST. M, T, W, Th, S, S"
       If batch type is EU ==> print "Class times are  10-5 EST. M, T, W, Th, F."
       If batch type is invalid, print "Invalid Btach"

    Note:
 	Solution 1: use if statement
	Solution 2: use switch statement
	Solution 2: use if & switch statements mixed
 */