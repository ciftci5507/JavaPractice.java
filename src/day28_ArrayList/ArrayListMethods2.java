package day28_ArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods2 {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(100);
        list.add(200);
        list.add(300);
        list.add(400);
        list.add(500);

        System.out.println(list);

        /*
        int num = 1;
        list.remove(num);
         */


        Integer num2 = 200;
        boolean r = list.remove(num2);
        System.out.println(r);

        System.out.println(list);

        System.out.println("--------");

        System.out.println(list.size());
        list.clear();
        System.out.println(list.size());
        System.out.println(list);

        System.out.println("--------------------");

        ArrayList<Character> characters = new ArrayList<>();

        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');
        characters.add('A');

        int a = characters.indexOf('A'); //0
        int b = characters.lastIndexOf('A');

        System.out.println(a);
        System.out.println(b);

        System.out.println("------------------------");

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.addAll(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(numbers);

    }
}
