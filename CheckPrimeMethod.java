import java.util.Scanner;

/*
 * Problem: Write a method that checks if a number is prime, then use it
 * in main().
 *
 * Example Input:
 * 17
 *
 * Example Output:
 * 17 is Prime
 */
public class CheckPrimeMethod {

    // Returns true if "number" is prime, false otherwise
    public static boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (isPrime(number)) {
            System.out.println(number + " is Prime");
        } else {
            System.out.println(number + " is not Prime");
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - Breaking logic into a method (isPrime) makes main() cleaner and lets
 *   us reuse the prime-check logic anywhere in the program.
 * - The method returns a boolean, which main() then uses in an if statement.
 */
