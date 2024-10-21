package com.example.solid.interfaceSegregation.good;

public class Bird implements Flyer, Eater{
    @Override
    public void eat() {
        // OK
    }

    @Override
    public void fly() {
        // OK
    }
}
