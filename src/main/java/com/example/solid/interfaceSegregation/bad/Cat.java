package com.example.solid.interfaceSegregation.bad;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat can eat");
    }

    @Override
    public void fly() {
        // Problem
        throw  new UnsupportedOperationException();
    }
}
