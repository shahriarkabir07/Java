import java.util.Scanner;

/*
 * Problem: Find the sum of the first N natural numbers using a loop.
 *
 * Example Input:
 * 5
 *
 * Example Output:
 * Sum of first 5 natural numbers = 15
 */
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        System.out.println("Sum of first " + n + " natural numbers = " + sum);

        scanner.close();
    }
}

/*
 * Explanation:
 * - The for loop runs from 1 to n, adding each value of i to sum.
 * - This is the classic accumulator pattern: start a variable at 0 and
 *   keep adding to it inside a loop.
 */
