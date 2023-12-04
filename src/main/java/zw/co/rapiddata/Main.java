package zw.co.rapiddata;

public class Main {
    public static void main(String[] args) {
        // Example usage
        Shape rectangle = new Rectangle(5, 8);
        Shape triangle = new Triangle(3, 4, 5);
        Shape circle = new Circle(2.5);

        ShapePerimeterDisplay.displayPerimeter(rectangle);
        ShapePerimeterDisplay.displayPerimeter(triangle);
        ShapePerimeterDisplay.displayPerimeter(circle);

    }
}