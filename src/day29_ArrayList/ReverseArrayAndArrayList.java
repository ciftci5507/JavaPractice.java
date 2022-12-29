package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ReverseArrayAndArrayList {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6};
        int [] reversedArray= new int[array.length];

        for (int i = array.length - 1, j = 0; j <= array.length - 1 && i >= 0; i--, j++) {
            reversedArray[j] = array[i];
        }
        System.out.println(Arrays.toString(reversedArray));

        System.out.println("---------------------------");

        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.addAll(Arrays.asList(1, 2, 3, 4, 5, 6));
        System.out.println(arrayList);

        System.out.println("----------------------------");

        ArrayList<Integer> reversedAL = new ArrayList<>();

        for (int i = arrayList.size() - 1; i >= 0; i--) {
            reversedAL.add(arrayList.get(i));
        }

        System.out.println(reversedAL);
    }
}
