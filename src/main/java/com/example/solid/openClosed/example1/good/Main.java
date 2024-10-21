package com.example.solid.openClosed.example1.good;

public class Main {
    public static void main(String[] args) {
        // Solution
        // I can calculate are of Shapes without change calculateArea()

        AreaService areaService = new AreaService();
        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(1.0);
        rectangle.setLength(2.0);
        double areaRectangle = areaService.calculateArea(rectangle);
        System.out.println(areaRectangle);

        Circle circle = new Circle();
        circle.setRadius(2);
        double areaCircle = areaService.calculateArea(circle);
        System.out.println(areaCircle);
    }
}
