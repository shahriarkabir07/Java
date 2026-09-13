import java.util.Scanner;

/*
 * Problem: Reverse the order of words in a sentence (not the letters).
 *
 * Example Input:
 * I love Java programming
 *
 * Example Output:
 * programming Java love I
 */
public class ReverseWordsInSentence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();

        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for (int i = words.length - 1; i >= 0; i--) {
            reversedSentence.append(words[i]);
            if (i != 0) {
                reversedSentence.append(" ");
            }
        }

        System.out.println(reversedSentence.toString());

        scanner.close();
    }
}

/*
 * Explanation:
 * - split(" ") breaks the sentence into an array of individual words.
 * - We loop through the words array backwards, appending each word to
 *   a StringBuilder to build the reversed sentence.
 * - StringBuilder is used instead of String concatenation because it is
 *   more efficient inside loops.
 */
