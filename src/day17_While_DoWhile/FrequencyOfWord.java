package day17_While_DoWhile;

public class FrequencyOfWord {
    public static void main(String[] args) {

        String str = "Java Mava JavaJava Tava Hava AgainJava";
        int frequency = 0;

        for (int i = 0; i < str.length() - 3; i++) {
            String subWord = str.substring(i, i + 4);
            if (subWord.equals("Java")) {
                frequency++;
            }
        }
        System.out.println(frequency);


    }
}
