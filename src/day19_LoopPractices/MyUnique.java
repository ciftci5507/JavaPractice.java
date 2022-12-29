package day19_LoopPractices;

public class MyUnique {

    public static void main(String[] args) {

        String str = "aaabbcdd";
        String uniques = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            do {
                uniques += "" + ch;
            } while ((uniques.contains("" + ch)));
        }
        System.out.println(uniques);

    }
}

