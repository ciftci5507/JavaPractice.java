package day19_LoopPractices;

public class UniqueCharacters {

    public static void main(String[] args) {

        String str = "aaaaffffsssderrrffthhyjkk";

        String uniques = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            uniques += "" + ch;
/*
            for (int j = 0; j <uniques.length(); j++) {
                if (uniques.contains(uniques.charAt(j))) {
                    continue;
                }
            }
*/
        }
        System.out.println(uniques);

    }
}


/*
        //FREQUENCY IS BELOW
        char ch = 'a';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);
            if (ch == each) {
                count++;
            }
        }

        System.out.println(count);

*/


