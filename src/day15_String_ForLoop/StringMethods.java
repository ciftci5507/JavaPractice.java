package day15_String_ForLoop;

public class StringMethods {
    public static void main(String[] args) {
        String str = "";

        boolean r = str.isEmpty(); //true

        System.out.println(r);

        String str2 = " ";

        boolean r2 = str2.isEmpty(); //false

        System.out.println(r2);

        System.out.println("------------------");

        String s1 = "CYDEO";
        String s2 = "cydeo";

        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println("yEs".equals("Yes"));
        System.out.println("YES".equalsIgnoreCase("yEs"));


        System.out.println("-------------------------");

        String sentence = "My favorite programming language is Java";

        boolean hasCSharp = sentence.contains("C#");
        boolean hasJava = sentence.contains("Java");
        boolean hasJava3 = sentence.toLowerCase().contains("java");

        System.out.println(hasCSharp);
        System.out.println(hasJava);
        System.out.println(hasJava3);

        System.out.println("---------------------");

        String input1 = "I love Java";
        String input2 = "Java";

        System.out.println(input1.equals(input2));
        System.out.println(input1.equalsIgnoreCase(input2));

        System.out.println(input1.contains(input2));

        System.out.println("-----------------");

        String a = "Wooden Spoon";

        boolean x = a.startsWith("Woo");
        boolean y = a.endsWith("Spoon");
        boolean z = a.toLowerCase().startsWith("wooden");

        System.out.println(x);
        System.out.println(y);
        System.out.println(z);


    }


}
