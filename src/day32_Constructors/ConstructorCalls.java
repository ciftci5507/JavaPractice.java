package day32_Constructors;

public class ConstructorCalls {

    public ConstructorCalls() {
        // this(a);  //compile error --->>> constructor can NOT contain itself
        System.out.println("Default Constructor");
    }

    public ConstructorCalls(int a) {
        this();
        System.out.println("Constructor with int argument");
        // this(); //error
    }

    public ConstructorCalls(String str) {
        this();
        // this(10); //compile error --->>> a constructor can call ONLY one constructor
        System.out.println("Constructor with String argument");
    }

    public static void main(String[] args) {

        ConstructorCalls obj1 = new ConstructorCalls();

        System.out.println("------------------------");

        ConstructorCalls obj2 = new ConstructorCalls(10);

        System.out.println("------------------------");

        ConstructorCalls obj3 = new ConstructorCalls("Java");






    }
}
