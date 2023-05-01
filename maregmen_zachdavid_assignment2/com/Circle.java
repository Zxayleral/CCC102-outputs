package com;

public class Circle implements com.Interfaces.CircleInterface{
    protected double radius;
    final double PI = 3.14;


    Circle(double radius) {
        this.radius = radius;
    }

    // Getter
    public double getRadius() {
        return this.radius;
    }

    // Setter
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Computation Functions
    public double getArea() {
        return this.radius * this.radius * PI;
    }

    public double getPerimeter() {
        return this.radius * 2 * PI;
    }

}
