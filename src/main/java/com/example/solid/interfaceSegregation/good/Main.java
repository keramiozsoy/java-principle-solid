package com.example.solid.interfaceSegregation.good;

public class Main {
    public static void main(String[] args) {
        Bird bird = new Bird();
        bird.eat();
        bird.fly();

        Cat cat = new Cat();
        cat.eat();

        // Solution
        // Create interface for each feature, eater and flyer.
        // You should implement only the feature interfaces that an animal needs.
        // You can NOT invoke cat.fly(); , Cats can not fly :)

    }
}
