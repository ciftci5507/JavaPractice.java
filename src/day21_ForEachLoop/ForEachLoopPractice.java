package day21_ForEachLoop;

public class ForEachLoopPractice {

    public static void main(String[] args) {

        String[] words = {"Java Programming", "Cydeo School", "Early Birds", "Angry Birds"};
/*
        for (String element : words) {
            System.out.print(element.charAt(0) + " ");
            System.out.println();
            System.out.print(element.charAt(element.length() - 1) + "");
        }

 */

        for (String each : words) {
            System.out.println(each.charAt(0) + "/" + each.charAt(each.length() - 1));
        }


    }

}
