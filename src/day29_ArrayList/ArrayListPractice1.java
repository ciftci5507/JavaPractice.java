package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice1 {

    public static void main(String[] args) {

        String[] countries = {"Japan", "Korea", "USA", "Turkey", "Canada", "UK"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(countries));

        list.removeIf(p -> p.length() <= 3);

        countries = list.toArray(new String[0]);

        System.out.println(Arrays.toString(countries));

    }
}
