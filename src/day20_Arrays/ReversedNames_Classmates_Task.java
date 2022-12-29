package day20_Arrays;

public class ReversedNames_Classmates_Task {

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


        for (String classmate : classmates) {
            String reversedName = "";
            for (int i = classmate.length() - 1; i >= 0; i--) {
                reversedName += classmate.charAt(i);
            }
            System.out.println(reversedName);
        }

    }
}


/*
2. create string array, and store the names of your  class mates (10)
            reverse each students names and print them in separate lines
            	ex:
            		arr = {java, python, c#}

        		output:
        			avaJ
        			nohtyp
        			#c
 */