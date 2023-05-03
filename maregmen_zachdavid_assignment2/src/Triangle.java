public class Triangle extends Parallelogram{

    Triangle(double base, double height) {
        super(0, base, height);
    }

    @Override
    public double getArea() {
        return super.getArea() / 2;
    }

    @Override
    public double getPerimeter() {
        return super.getPerimeter();
    }


}
