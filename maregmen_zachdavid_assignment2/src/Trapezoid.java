public class Trapezoid extends Parallelogram {
    double secondBase;
    double secondSide;

    Trapezoid(double side, double base, double height, double secondBase, double secondSide) {
        super(side, base, height);
        this.secondBase = secondBase;
        this.secondSide = secondSide;
    }

    @Override
    public double getPerimeter() {
        return this.side + this.secondSide + this.base + this.secondBase;
    }

    @Override
    public double getArea() {
        return ((this.base + this.secondBase) / 2) * this.height;
    }

}
