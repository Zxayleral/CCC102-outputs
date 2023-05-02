package activity;

public class Interfaces {



    public interface Shape {
        public double getArea();
        public double getPerimeter();
        public String toString();
    }


    public interface CircleInterface extends Shape {

        public double getRadius();
        public void setRadius(double radius);
    }



}
