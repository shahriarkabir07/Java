import java.util.Scanner;

/*
 * Problem: Print the first N terms of the Fibonacci series.
 * Each number is the sum of the two numbers before it: 0, 1, 1, 2, 3, 5...
 *
 * Example Input:
 * 7
 *
 * Example Output:
 * 0 1 1 2 3 5 8
 */
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();

        int first = 0;
        int second = 1;

        for (int i = 1; i <= n; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
        System.out.println();

        scanner.close();
    }
}

/*
 * Explanation:
 * - We keep track of two numbers, "first" and "second".
 * - In each step we print "first", then shift the window forward:
 *   the old "second" becomes the new "first", and their sum becomes
 *   the new "second".
 */
