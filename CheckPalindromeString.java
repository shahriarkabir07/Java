import java.util.Scanner;

/*
 * Problem: Check whether a given string is a palindrome (reads the same
 * forwards and backwards).
 *
 * Example Input:
 * madam
 *
 * Example Output:
 * madam is a Palindrome
 */
public class CheckPalindromeString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String original = scanner.nextLine();

        String reversed = new StringBuilder(original).reverse().toString();

        if (original.equalsIgnoreCase(reversed)) {
            System.out.println(original + " is a Palindrome");
        } else {
            System.out.println(original + " is not a Palindrome");
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - StringBuilder's reverse() method easily reverses the characters
 *   of a string.
 * - We compare the original string with its reversed version; if they
 *   match, the string is a palindrome.
 * - equalsIgnoreCase() makes the comparison case-insensitive.
 */
