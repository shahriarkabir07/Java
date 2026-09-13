/*
 * Problem: Demonstrate Runtime Polymorphism (Method Overriding) using a
 * Shape superclass reference that can point to different subclass
 * objects, calling the correct overridden method automatically.
 *
 * Example Input:
 * A Circle with radius 5 and a Rectangle with sides 4 and 6.
 *
 * Example Output:
 * Area of Circle = 78.5
 * Area of Rectangle = 24.0
 */
class Shape {
    public double calculateArea() {
        return 0.0;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14 * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}

public class ShapeRuntimePolymorphism {
    public static void main(String[] args) {
        // A Shape reference can point to any subclass object
        Shape shape1 = new Circle(5);
        Shape shape2 = new Rectangle(4, 6);

        System.out.println("Area of Circle = " + shape1.calculateArea());
        System.out.println("Area of Rectangle = " + shape2.calculateArea());
    }
}

/*
 * Explanation:
 * - This is runtime polymorphism: even though "shape1" and "shape2" are
 *   declared as type Shape, Java calls each object's actual (overridden)
 *   calculateArea() method at runtime, based on its real type
 *   (Circle or Rectangle).
 * - This lets us write code that works with the general Shape type while
 *   still getting the specific behavior of each subclass.
 */
