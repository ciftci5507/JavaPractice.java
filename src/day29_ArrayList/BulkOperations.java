package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1, 6, 6, 6, 4, 5, 7, 7, 8, 8, 7, 3, 4, 5, 4));

        System.out.println(list);

        list.removeAll(Arrays.asList(4, 6, 7));

        System.out.println(list);

        list.retainAll(Arrays.asList(1, 3));

        System.out.println(list);

        System.out.println("----------");

        String[] names = {"Josh", "Jack", "Daniel", "Shay", "Breanna"};

        //ArrayList<String> nameList = new ArrayList<>();

        //nameList.addAll(Arrays.asList(names));

        ArrayList<String> nameList = new ArrayList<>(Arrays.asList(names));

        System.out.println(nameList);

        System.out.println("-------------------------------");

        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        // ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr)); ERR!!

        Integer[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(arr2));

        System.out.println(list2);

        System.out.println("--------------");

        int[] arr3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        ArrayList<Integer> list4 = new ArrayList<>(convertArrayToArrayList(arr3));

        System.out.println("list4 = " + list4);


    }

    public static ArrayList<Integer> convertArrayToArrayList(int[] array) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int each : array) {
            list.add(each);
        }
        return list;
    }
}
