import java.util.Scanner;

/*
 * Problem: Print all prime numbers between 2 and N using nested loops.
 * A prime number has exactly two divisors: 1 and itself.
 *
 * Example Input:
 * 20
 *
 * Example Output:
 * Prime numbers up to 20: 2 3 5 7 11 13 17 19
 */
public class PrimeNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        System.out.print("Prime numbers up to " + n + ": ");
        for (int number = 2; number <= n; number++) {
            boolean isPrime = true;

            for (int divisor = 2; divisor <= Math.sqrt(number); divisor++) {
                if (number % divisor == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.print(number + " ");
            }
        }
        System.out.println();

        scanner.close();
    }
}

/*
 * Explanation:
 * - The outer loop checks every number from 2 to N.
 * - The inner loop tries to divide the number by every value up to its
 *   square root; if any divisor divides it evenly, it is not prime.
 * - Checking only up to the square root is enough and makes the program
 *   faster than checking up to the number itself.
 */
