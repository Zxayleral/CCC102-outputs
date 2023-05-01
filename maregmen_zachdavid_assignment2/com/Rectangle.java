package com;

public class Rectangle implements com.Interfaces.Quadrilateral {
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    // Setters
    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    // Getters 
    public double getWidth() {
        return this.width;
    }

    public double getHeight() {
        return this.height;
    }

    // Computation Functions
    public double getArea() {
        return this.width * this.height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    
}
