/*
 * Problem: Find the second largest number in an array without sorting it.
 *
 * Example Input:
 * {10, 25, 15, 25, 8}
 *
 * Example Output:
 * Second largest = 15
 */
public class SecondLargestInArray {
    public static void main(String[] args) {
        int[] numbers = {10, 25, 15, 25, 8};

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int number : numbers) {
            if (number > largest) {
                secondLargest = largest;
                largest = number;
            } else if (number > secondLargest && number != largest) {
                secondLargest = number;
            }
        }

        System.out.println("Second largest = " + secondLargest);
    }
}

/*
 * Explanation:
 * - We track both "largest" and "secondLargest" while scanning the array once.
 * - If we find a new largest value, the old largest becomes the second largest.
 * - If a value is smaller than the largest but bigger than the current
 *   second largest (and different from largest), it becomes the new
 *   second largest. This correctly skips duplicate largest values.
 */
