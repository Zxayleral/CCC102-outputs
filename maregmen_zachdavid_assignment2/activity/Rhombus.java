package activity;
public class Rhombus implements activity.Interfaces.Shape {
    private double firstDiagonal;
    private double secondDiagonal;
    Rhombus(double firstDiagonal,double secondDiagonal) {
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    public double getFirstDiagonal() {
        return firstDiagonal;
    }

    public double getSecondDiagonal() {
        return secondDiagonal;
    }

    public void setFirstDiagonal(double firstDiagonal) {
        this.firstDiagonal = firstDiagonal;
    }

    public void setSecondDiagonal(double secondDiagonal) {
        this.secondDiagonal = secondDiagonal;
    }

    public double getArea() {
        return (this.firstDiagonal * this.secondDiagonal) / 2;
    }


    public double getPerimeter() {
        return 2 * (Math.sqrt(Math.exp(this.firstDiagonal) + Math.exp(this.secondDiagonal)));
    }
}
