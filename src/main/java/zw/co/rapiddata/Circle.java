package zw.co.rapiddata;

public class Circle extends Shape{

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
