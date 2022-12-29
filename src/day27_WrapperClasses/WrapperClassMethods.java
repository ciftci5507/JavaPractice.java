package day27_WrapperClasses;

public class WrapperClassMethods {

    public static void main(String[] args) {

        String str = "123";

        int num = Integer.parseInt(str);

        System.out.println(num + 1);
        System.out.println(str + 1);

        String str2 = "10.5";

        double num2 = Double.parseDouble(str2);

        System.out.println(num2 + 1);

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        System.out.println("max = " + max);
        System.out.println("min = " + min);

        System.out.println("---------------------");

        String s2 = "123";
        Integer x = Integer.valueOf(s2);
        System.out.println(x);

        char ch1 = '0';

        boolean r2 = Character.isDigit(ch1);

        System.out.println(r2);

        String s = "addd!23453fsdafa";

        int sum = 0;

        for (char each : s.toCharArray()) {
            if (Character.isDigit(each)) {
                sum += Integer.parseInt("" + each);
            }
        }
        System.out.println("sum = " + sum);

    }
}
