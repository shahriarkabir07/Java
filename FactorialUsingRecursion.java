import java.util.Scanner;

/*
 * Problem: Find the factorial of a number using recursion (a method that
 * calls itself).
 *
 * Example Input:
 * 5
 *
 * Example Output:
 * Factorial of 5 = 120
 */
public class FactorialUsingRecursion {

    public static long factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // base case: stops the recursion
        }
        return n * factorial(n - 1); // recursive case
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        System.out.println("Factorial of " + n + " = " + factorial(n));

        scanner.close();
    }
}

/*
 * Explanation:
 * - Recursion means a method calling itself with a smaller version of
 *   the same problem.
 * - Every recursive method needs a "base case" that stops the recursion
 *   (here, factorial(0) and factorial(1) both equal 1).
 * - factorial(5) = 5 * factorial(4) = 5 * 4 * factorial(3) ... and so on,
 *   until the base case is reached.
 */
