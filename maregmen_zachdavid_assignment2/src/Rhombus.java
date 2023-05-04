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

    public String toString() {
        return String.format(
            "Circle [<width=%f>, <height=%f>, <firstDiagonal=%f>, <firstDiagonal=%f>, <area=%f>, <perimeter=%f>]", 
            this.width, 
            this.height,
            this.firstDiagonal,
            this.secondDiagonal,
            this.getArea(), 
            this.getPerimeter()
            ); 
    }
}
