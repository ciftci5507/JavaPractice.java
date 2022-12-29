package day19_LoopPractices;

public class HakimUnique {
    public static void main(String[] args) {

        String a = "aaaaffffsssderrrffthhyjkk";

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            int count = 0;

            for (int j = 0; j < a.length(); j++) {
                if (ch == a.charAt(j)) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println(a.charAt(i));
            }
        }
    }

}

