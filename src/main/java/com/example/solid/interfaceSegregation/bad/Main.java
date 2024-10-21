package com.example.solid.interfaceSegregation.bad;

public class Main {
    public static void main(String[] args) {
        Animal bird = new Bird();
        bird.eat();
        bird.fly();

        Animal cat = new Cat();
        cat.eat();
        cat.fly();

        // Problem
        // Animals have properties like fly() and eat()
        // Some animals can NOT fly(), ex : Cat
        // When we invoked cat.fly(), we will get an error
        // The animal design is not support clean code.
    }
}
