package day29_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CollectionsUtility {

    public static void main(String[] args) {


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(2, 7, 5, 4, 6, 9, 0, 1, 3));

        Collections.sort(list);

        System.out.println(list);

        Collections.reverse(list);

        System.out.println(list);

        Collections.swap(list, 3, list.size() - 1);

        System.out.println(list);



    }
}
