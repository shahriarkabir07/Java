import java.util.Scanner;

/*
 * Problem: Check whether a given number is even or odd.
 *
 * Example Input:
 * 7
 *
 * Example Output:
 * 7 is Odd
 */
public class CheckEvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - The modulus operator (%) gives the remainder of a division.
 * - Any number that leaves a remainder of 0 when divided by 2 is even;
 *   otherwise it is odd.
 */
