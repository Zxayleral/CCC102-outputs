package activity;

public class SemiCircle extends Circle {

    SemiCircle(double radius) {
        super(radius);
    }

    // overrided functions
    @Override 
    public double getPerimeter() {
        return this.radius * PI;
    }

    @Override
    public double getArea() {
        return (this.radius * this.radius * PI) / 2;
    }
    
}
