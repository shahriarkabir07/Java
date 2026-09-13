/*
 * Problem: Reverse the elements of an array without using a second array.
 *
 * Example Input:
 * {1, 2, 3, 4, 5}
 *
 * Example Output:
 * Reversed array: 5 4 3 2 1
 */
public class ReverseArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};

        int start = 0;
        int end = numbers.length - 1;

        while (start < end) {
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            start++;
            end--;
        }

        System.out.print("Reversed array: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();
    }
}

/*
 * Explanation:
 * - We use two pointers: "start" at the beginning and "end" at the end
 *   of the array.
 * - We swap the elements at these positions and move the pointers toward
 *   the middle until they meet.
 */
