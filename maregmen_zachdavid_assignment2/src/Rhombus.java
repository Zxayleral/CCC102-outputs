public class Rhombus extends Rectangle{
    double firstDiagonal, secondDiagonal;
    Rhombus(double firstDiagonal, double secondDiagonal) {
        super(Math.exp(firstDiagonal/2), Math.exp(secondDiagonal/2));
        this.firstDiagonal = firstDiagonal;
        this.secondDiagonal = secondDiagonal;
    }

    @Override
    public double getArea() {
        return (this.firstDiagonal * this.secondDiagonal) / 2;
    }
}
