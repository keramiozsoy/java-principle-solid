package com.example.solid.interfaceSegregation.bad;

public class Bird implements Animal {
    @Override
    public void eat() {
        System.out.println("Bird can eat");
    }

    @Override
    public void fly() {
        System.out.println("Bir can fly");
    }
}
