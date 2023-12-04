package zw.co.rapiddata;

public class Rectangle extends Shape{

    private final double length;
    private final double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
