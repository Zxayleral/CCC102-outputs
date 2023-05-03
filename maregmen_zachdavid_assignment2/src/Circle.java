public class Circle extends Shape {
    private int radius;
    public static final double PI = 3.14;

    public double getArea() {
        return (this.radius * this.radius) * Circle.PI;
    }

    public double getPerimeter() {
        return (2 * this.radius) * Circle.PI;
    }

}
