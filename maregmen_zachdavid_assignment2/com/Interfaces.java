package com;

public class Interfaces {

    public interface Shape {
        public double getArea();
        public double getPerimeter();
    }

    public interface Quadrilateral extends Shape {
        public double getWidth();
        public double getHeight();
        public void setWidth(double width);
        public void setHeight(double height);
    }

    public interface CircleInterface extends Shape {
        public double getRadius();
        public void setRadius(double radius);
    }

}
