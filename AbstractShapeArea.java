/*
 * Problem: Demonstrate an Abstract Class by defining a Shape class that
 * cannot be instantiated directly and forces its subclasses to implement
 * the area() method.
 *
 * Example Input:
 * A Circle with radius 4 and a Square with side 5.
 *
 * Example Output:
 * Circle area = 50.24
 * Square area = 25.0
 */
abstract class Shape {
    // Abstract method: no body here, must be implemented by subclasses
    public abstract double area();

    // Regular (concrete) method: shared by all subclasses as-is
    public void printType() {
        System.out.println("This shape is a: " + this.getClass().getSimpleName());
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}

class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }
}

public class AbstractShapeArea {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape square = new Square(5);

        circle.printType();
        System.out.println("Circle area = " + circle.area());

        square.printType();
        System.out.println("Square area = " + square.area());

        // The next line would NOT compile if uncommented, because
        // an abstract class cannot be instantiated directly:
        // Shape shape = new Shape();
    }
}

/*
 * Explanation:
 * - An abstract class (declared with the "abstract" keyword) can have
 *   both abstract methods (no body) and regular methods with a body.
 * - It cannot be instantiated on its own with "new Shape()"; it must be
 *   extended by a subclass.
 * - Every subclass that extends Shape is forced to provide its own
 *   implementation of area(), guaranteeing that behavior exists while
 *   still allowing each shape to calculate area differently.
 */
