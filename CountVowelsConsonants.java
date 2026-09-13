import java.util.Scanner;

/*
 * Problem: Count the number of vowels and consonants in a given string.
 *
 * Example Input:
 * Hello World
 *
 * Example Output:
 * Vowels = 3
 * Consonants = 7
 */
public class CountVowelsConsonants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String text = scanner.nextLine().toLowerCase();

        int vowelCount = 0;
        int consonantCount = 0;

        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);

            if (ch < 'a' || ch > 'z') {
                continue; // skip spaces, numbers, punctuation
            }

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            } else {
                consonantCount++;
            }
        }

        System.out.println("Vowels = " + vowelCount);
        System.out.println("Consonants = " + consonantCount);

        scanner.close();
    }
}

/*
 * Explanation:
 * - We convert the string to lowercase first so we only need to check
 *   for lowercase vowels.
 * - We loop through each character; letters outside "a" to "z" (like
 *   spaces) are skipped using continue.
 * - Every remaining letter is either a vowel or a consonant.
 */
