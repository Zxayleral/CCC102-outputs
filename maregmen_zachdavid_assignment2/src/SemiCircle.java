public class SemiCircle extends Circle {
    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter() / 2;
    }
}
