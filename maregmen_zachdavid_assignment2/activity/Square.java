package activity;

public class Square implements Interfaces.Shape {
    private double side;

    // Getter 
    public double getSide() {
        return this.side;
    }

    // Setter 
    public void setSide(double side) {
        this.side = side;
    }

    // Computation Functions 
    public double getPerimeter() {
        return this.side * 4;
    }

    public double getArea() {
        return this.side * this.side;
    }
 
}
