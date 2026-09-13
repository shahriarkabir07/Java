/*
 * Problem: Find the maximum and minimum values in an array of integers.
 *
 * Example Input:
 * {12, 45, 3, 67, 21}
 *
 * Example Output:
 * Maximum = 67
 * Minimum = 3
 */
public class FindMaxMinInArray {
    public static void main(String[] args) {
        int[] numbers = {12, 45, 3, 67, 21};

        int max = numbers[0];
        int min = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Maximum = " + max);
        System.out.println("Minimum = " + min);
    }
}

/*
 * Explanation:
 * - We assume the first element is both the max and min to start with.
 * - As we loop through the rest of the array, we update max/min whenever
 *   we find a bigger or smaller value.
 */
