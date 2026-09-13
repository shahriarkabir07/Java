/*
 * Problem: Sort an array of integers in ascending order using the
 * Bubble Sort algorithm.
 *
 * Example Input:
 * {5, 2, 9, 1, 5, 6}
 *
 * Example Output:
 * Sorted array: 1 2 5 5 6 9
 */
public class BubbleSortArray {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};

        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers.length - 1 - i; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    // swap numbers[j] and numbers[j + 1]
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }

        System.out.print("Sorted array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

/*
 * Explanation:
 * - Bubble sort repeatedly compares adjacent elements and swaps them if
 *   they are in the wrong order.
 * - After each full pass, the largest remaining unsorted element "bubbles"
 *   to its correct position at the end of the array.
 * - We do this for (length - 1) passes to guarantee the whole array
 *   is sorted.
 */
