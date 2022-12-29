package day20_Arrays;

import java.util.Arrays;

public class TaskWithTernaries {

    public static void main(String[] args) {

        String[] names = {"Anna", "Nancy", "Sarah"};
        int[] scores = {90, 75, 80};
        char[] grades = new char[names.length];

        for (int i = 0; i < names.length; i++) {
           grades[i]= (scores[i] >= 90 && scores[i] <= 100) ? grades[i] = 'A' : (scores[i] >= 80) ? grades[i] = 'B' :
                    (scores[i] >= 70) ? grades[i] = 'C' : (scores[i] >= 60) ? grades[i] = 'D' :
                             'F';
        }
        System.out.println(Arrays.toString(grades));
    }
}
