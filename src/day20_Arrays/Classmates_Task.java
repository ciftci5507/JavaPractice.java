package day20_Arrays;

import java.util.Arrays;

public class Classmates_Task {

    public static void main(String[] args) {

        String[] classmates = new String[10];

        classmates[0] = "Tarik Bugra";
        classmates[1] = "Orhan Veli";
        classmates[2] = "Aristo Teles";
        classmates[3] = "Sait Faik";
        classmates[4] = "Sabahattin Ali";
        classmates[5] = "Kemal Tahir";
        classmates[6] = "Kazuo Ishiguro";
        classmates[7] = "Cenap Sahabettin";
        classmates[8] = "Namik Kemal";
        classmates[9] = "Ahmed Hamdi";

        //System.out.println(Arrays.toString(classmates));


        for (String classmate : classmates) {
            System.out.println(classmate.charAt(0) + ". " + classmate.charAt(classmate.indexOf(" ") + 1));
        }


    }
}

/*
1. create an array named classmates,
and store 10 of your classmates' full names
            print the initials of each classmates
            in separate lines
 */