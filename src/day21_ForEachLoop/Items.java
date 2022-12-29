package day21_ForEachLoop;

import java.util.Arrays;

public class Items {

    public static void main(String[] args) {

        String[] items = {"a", "b", "c", "d"};

        double[] prices = {99.99, 150.0, 9.7, 250.0};

        int[] itemIDs = {12343, 65425, 77737, 68654};

        for (int i = 0; i < items.length; i++) {
            String item = items[i];
            double price = prices[i];
            int id = itemIDs[i];

            System.out.println(item + " - " + id + " - $" + price);
        }

    }
}
