package day36_Inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', "Small", 2, "black");

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', "Small", 3, "Brown");
        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        cat.scratch();

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan","Bengal",'M',"Large",4,"Orange");

        System.out.println(cat);


    }
}
