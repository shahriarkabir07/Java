/*
 * Problem: Demonstrate Compile-time Polymorphism (Method Overloading)
 * using a Calculator class with multiple "add" methods.
 *
 * Example Input:
 * add(2, 3), add(2, 3, 4), add(2.5, 3.5)
 *
 * Example Output:
 * 2 + 3 = 5
 * 2 + 3 + 4 = 9
 * 2.5 + 3.5 = 6.0
 */
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c) {
        return a + b + c;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class CalculatorOverloading {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        System.out.println("2 + 3 = " + calculator.add(2, 3));
        System.out.println("2 + 3 + 4 = " + calculator.add(2, 3, 4));
        System.out.println("2.5 + 3.5 = " + calculator.add(2.5, 3.5));
    }
}

/*
 * Explanation:
 * - This is called compile-time polymorphism because Java decides which
 *   "add" method to call at compile time, based on the number and types
 *   of arguments used in the call.
 * - All three methods share the same name but behave differently
 *   depending on their parameters.
 */
