package day37_Inheritance.animalTak;

public class Dog extends Animal {
    public int a;

    public Dog(String name, String breed, char gender, String size, int age, String color, int a) {
        super(name, breed, gender, size, age, color);
        this.a = a;
    }
}

