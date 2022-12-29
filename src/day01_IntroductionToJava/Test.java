package day01_IntroductionToJava;

import utilities.StringUtility;

public class Test {

    public static void main(String[] args) {

        String str = "Wooden Spoon";

        StringUtility.printEachChar(str);

        System.out.println("----------------");

        str = StringUtility.reverse(str);
        System.out.print(str);
    }
}
