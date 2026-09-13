import java.util.Scanner;

/*
 * Problem: Swap the values of two variables, first using a temporary
 * variable, and then without using any temporary variable.
 *
 * Example Input:
 * a = 5, b = 10
 *
 * Example Output:
 * Before Swap: a = 5, b = 10
 * After Swap (with temp): a = 10, b = 5
 * After Swap (without temp): a = 5, b = 10
 */
public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter value of a: ");
        int a = scanner.nextInt();

        System.out.print("Enter value of b: ");
        int b = scanner.nextInt();

        System.out.println("Before Swap: a = " + a + ", b = " + b);

        // Method 1: using a temporary variable
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After Swap (with temp): a = " + a + ", b = " + b);

        // Method 2: without using a temporary variable
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After Swap (without temp): a = " + a + ", b = " + b);

        scanner.close();
    }
}

/*
 * Explanation:
 * - The temp variable method stores one value temporarily so it is not lost.
 * - The arithmetic method uses addition and subtraction to swap values
 *   without needing extra memory. It only works safely with numbers that
 *   do not cause overflow.
 */
