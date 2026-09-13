import java.util.Scanner;

/*
 * Problem: Remove duplicate characters from a string, keeping only the
 * first occurrence of each character.
 *
 * Example Input:
 * programming
 *
 * Example Output:
 * Result = progamin
 */
public class RemoveDuplicateCharacters {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            char currentChar = text.charAt(i);

            // indexOf on the result so far tells us if we already added this character
            if (result.indexOf(String.valueOf(currentChar)) == -1) {
                result.append(currentChar);
            }
        }

        System.out.println("Result = " + result.toString());

        scanner.close();
    }
}

/*
 * Explanation:
 * - We build a new string character by character.
 * - Before adding a character, we check whether it already exists in the
 *   result so far using indexOf(); if it does, we skip it.
 * - This keeps only the first occurrence of every character, in order.
 */
