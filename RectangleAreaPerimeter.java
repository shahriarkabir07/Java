import java.util.Scanner;

/*
 * Problem: Calculate the area and perimeter of a rectangle given its
 * length and width.
 *
 * Example Input:
 * length = 10, width = 5
 *
 * Example Output:
 * Area = 50.0
 * Perimeter = 30.0
 */
public class RectangleAreaPerimeter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter length: ");
        double length = scanner.nextDouble();

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        double area = length * width;
        double perimeter = 2 * (length + width);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);

        scanner.close();
    }
}

/*
 * Explanation:
 * - Area of a rectangle = length * width.
 * - Perimeter of a rectangle = 2 * (length + width).
 * - We use double instead of int so the program also works with
 *   decimal measurements.
 */
