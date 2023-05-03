public class Parallelogram extends Shape{
    double height;
    double base;
    double side;

    Parallelogram(double side, double base, double height) {
        this.base = base;
        this.height = height;
        this.side = side;
    }

    public double getPerimeter() {
        return 2 * (base + height);
    }

    public double getArea() {
        return base * height;
    }
}
