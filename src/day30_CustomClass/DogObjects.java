package day30_CustomClass;

import java.util.ArrayList;

public class DogObjects {

    public static void main(String[] args) {

        Dog dog1 = new Dog();

        dog1.name = "Lessi";
        dog1.breed = "Kangal";
        dog1.age = 5;
        dog1.gender = 'F';
        dog1.size = "Small";
        dog1.color = "Yellow";


        System.out.println(dog1);

        Dog dog2 = new Dog();
        dog2.setInfo("Jack", "German Shepard", 2,
                'M', "Large", "Black");

        System.out.println(dog2);

        dog1.eat();
        dog2.bark();

        Dog dog3 = new Dog();
        Dog dog4 = new Dog();

        dog3.setInfo("Bullet","Labrador",3,
                'M',"ExtraLarge","Brown");

        dog4.setInfo("Sully","Pitt-Bull",6,
                'F',"Large","Black");

        System.out.println("-------------------------");

        Dog[] dogs = {dog1, dog2, dog3, dog4};

        ArrayList<Dog> femaleDogs = new ArrayList<>();
        ArrayList<Dog> maleDogs = new ArrayList<>();

    }
}
