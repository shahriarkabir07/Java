import java.util.Scanner;

/*
 * Problem: Find the factorial of a number using a loop.
 * Factorial of n (n!) = 1 * 2 * 3 * ... * n
 *
 * Example Input:
 * 5
 *
 * Example Output:
 * Factorial of 5 = 120
 */
public class FactorialUsingLoop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = scanner.nextInt();

        long factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }

        System.out.println("Factorial of " + n + " = " + factorial);

        scanner.close();
    }
}

/*
 * Explanation:
 * - We start "factorial" at 1 (not 0, since multiplying by 0 would give 0).
 * - Each loop iteration multiplies the running total by the next number.
 * - "long" is used instead of "int" because factorials grow very quickly.
 */
