package com.example.solid.openClosed.example1.good;

public class Rectangle implements Shape{
    private Double height;
    private Double length;

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return height * length;
    }
}
