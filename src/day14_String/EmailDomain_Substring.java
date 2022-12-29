package day14_String;

public class EmailDomain_Substring {
    public static void main(String[] args) {

        String email = "Cydeo.School@gmail.com";
        //domain: gmail
        int beginningIndex = email.indexOf("@") + 1;
        int endingIndex = email.lastIndexOf(".");

        String domain = email.substring(beginningIndex, endingIndex);
        System.out.println(domain);

        System.out.println("____________________________________");

        String str1 = "Java is fun, Java is cool";
        String s1 = str1.substring(0, 10+1);
        System.out.println(s1);

        String s2 = str1.substring(str1.lastIndexOf("J"));
        System.out.println(s2);


    }
}
