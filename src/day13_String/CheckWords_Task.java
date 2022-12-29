package day13_String;

public class CheckWords_Task {

    public static void main(String[] args) {

        String word1 = "Ahmet";
        String word2 = "Ali";
        String word3 = "Faruk";

        if (word1.length() == word2.length() && word2.length() == word3.length())
            System.out.println("All words are same length");
        else if ((word1.length() == word2.length() && !(word2.length() == word3.length())) ||
                word1.length() == word3.length() && !(word1.length() == word2.length()))
            System.out.println("Not Same nor Different lengths");

        else
            System.out.println("All different length");

    }
}
/*
7. Write a program  for CheckWords, the program accepts 3 words and :
            - if they are same length:  print "All words are same length"
            - if some same length and others not:    print "Not Same nor Different lengths"
            - if all different length :  print "All different length"

 */