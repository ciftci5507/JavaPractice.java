package day34_GarbageCollection_AccessModifiers;

import java.util.ArrayList;
import java.util.Arrays;

public class Circle {

    public double radius;
    public static double pi;
    public static String name;

    public static ArrayList<Integer> numbers = new ArrayList<>();


    public Circle(double radius) {
        this.radius = radius;
        // pi = 3.14; //wil be created every time, so should Not be in here, USE static block
    }

    static {
        pi = 3.14;
        name = "Circle";
    }

}
