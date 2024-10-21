package com.example.solid.openClosed.example1.bad;

public class Main {
    public static void main(String[] args) {
        AreaService areaService = new AreaService();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(1.0);
        rectangle.setLength(2.0);
        double result = areaService.calculateArea(rectangle);
        System.out.println(result);

        // Problem
        // I can not calculate area of Circle
        Circle circle = new Circle();
        circle.setRadius(2);
        //areaService.calculateArea(circle);
    }
}
