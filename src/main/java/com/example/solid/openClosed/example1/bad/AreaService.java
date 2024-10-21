package com.example.solid.openClosed.example1.bad;

public class AreaService {
    double calculateArea(Rectangle rectangle){
        return rectangle.getHeight() * rectangle.getLength();
    }
}
