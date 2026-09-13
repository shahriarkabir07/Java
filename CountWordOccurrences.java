import java.util.Scanner;

/*
 * Problem: Count how many times a specific word appears in a sentence.
 *
 * Example Input:
 * Sentence: "the quick brown fox jumps over the lazy dog the end"
 * Word to find: "the"
 *
 * Example Output:
 * "the" appears 3 times
 */
public class CountWordOccurrences {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine().toLowerCase();

        System.out.print("Enter the word to search for: ");
        String targetWord = scanner.nextLine().toLowerCase();

        String[] words = sentence.split(" ");
        int count = 0;

        for (String word : words) {
            if (word.equals(targetWord)) {
                count++;
            }
        }

        System.out.println("\"" + targetWord + "\" appears " + count + " times");

        scanner.close();
    }
}

/*
 * Explanation:
 * - We split the sentence into words using split(" ").
 * - We compare each word to the target word using equals() (converted
 *   to lowercase first so the search is not case-sensitive).
 * - A counter is incremented every time a match is found.
 */
