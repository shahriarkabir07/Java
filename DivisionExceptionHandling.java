import java.util.Scanner;
import java.util.InputMismatchException;

/*
 * Problem: Divide two numbers entered by the user, safely handling the
 * case where the divisor is zero or the input is not a valid number.
 *
 * Example Input:
 * 10 0
 *
 * Example Output:
 * Error: Cannot divide by zero.
 */
public class DivisionExceptionHandling {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter numerator: ");
            int numerator = scanner.nextInt();

            System.out.print("Enter denominator: ");
            int denominator = scanner.nextInt();

            int result = numerator / denominator;
            System.out.println("Result = " + result);

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");

        } catch (InputMismatchException e) {
            System.out.println("Error: Please enter valid whole numbers.");

        } finally {
            System.out.println("Division attempt finished.");
            scanner.close();
        }
    }
}

/*
 * Explanation:
 * - Code that might throw an exception is placed inside a try block.
 * - Dividing by zero throws an ArithmeticException, which we catch and
 *   handle with a friendly message instead of crashing the program.
 * - InputMismatchException is thrown if the user types something that
 *   is not a number; we catch that separately too.
 * - The finally block always runs, whether or not an exception occurred,
 *   which is useful for cleanup code like closing the Scanner.
 */
