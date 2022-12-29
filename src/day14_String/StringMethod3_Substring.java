package day14_String;

public class StringMethod3_Substring {
    public static void main(String[] args) {
        //substring(beginning index, ending index)

        String word = "Cydeo School";
        //             012345...

        String brand = word.substring(0, 5);
        System.out.println(brand);

        String word2 = "Java Programming Language";
        String s1 = word2.substring(0, word2.indexOf(" ")); //Java
        String s2 = word2.substring(word2.indexOf("P"), word2.lastIndexOf(" ")); // Programming
        String s3 = word2.substring(word2.lastIndexOf(" ") + 1); // Language

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}
