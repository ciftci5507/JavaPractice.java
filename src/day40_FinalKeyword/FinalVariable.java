package day40_FinalKeyword;

public class FinalVariable {

    final static String name;
    final String birthDay;

    public FinalVariable(String birthDay) {
        this.birthDay = birthDay;
    }

    static{
        name = "Batch 10";
    }


    public static void main(String[] args) {

        final double pi = 3.14;

        final String name;

        name = "Java";

        // name = "Wooden Spoon";

        System.out.println(name);

        System.out.println("------------------");

        FinalVariable obj = new FinalVariable("May/01");

        // obj.birthDay = "June/01";

        System.out.println(obj.birthDay);

        System.out.println("----------------------");

        // FinalVariable.name = "Python";
        System.out.println(FinalVariable.name);


    }
}
