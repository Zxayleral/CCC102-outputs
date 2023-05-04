public class Rectangle extends Shape {
    double width;
    double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;
    }

    public double getArea() {
        return this.width * this.height;
    }

    public String toString() {
        return String.format(
            "Circle [<base=%f>, <height=%f>, <area=%f>, <perimeter=%f>]", 
            this.width,
            this.height,
            this.getArea(), 
            this.getPerimeter()
            ); 
    }
}
