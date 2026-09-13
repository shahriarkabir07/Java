/*
 * Problem: Demonstrate method overloading by creating multiple "sum"
 * methods that accept a different number or type of parameters.
 *
 * Example Input:
 * (values are provided directly in the code for simplicity)
 *
 * Example Output:
 * Sum of two ints = 15
 * Sum of three ints = 30
 * Sum of two doubles = 7.8
 */
public class MethodOverloadingSum {

    // Version 1: adds two integers
    public static int sum(int a, int b) {
        return a + b;
    }

    // Version 2: adds three integers (overloaded - different parameter count)
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    // Version 3: adds two doubles (overloaded - different parameter type)
    public static double sum(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sum of two ints = " + sum(5, 10));
        System.out.println("Sum of three ints = " + sum(5, 10, 15));
        System.out.println("Sum of two doubles = " + sum(3.3, 4.5));
    }
}

/*
 * Explanation:
 * - Method overloading means having multiple methods with the same name
 *   but different parameter lists (different number or types of parameters).
 * - Java decides which version to call based on the arguments you pass in.
 *   This is also called compile-time (static) polymorphism.
 */
