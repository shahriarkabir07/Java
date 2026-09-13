import java.util.Scanner;

/*
 * Problem: Search for a target value in an array using Linear Search
 * and print its index (or a not-found message).
 *
 * Example Input:
 * Array: {4, 8, 15, 16, 23, 42}, target = 16
 *
 * Example Output:
 * Element found at index 3
 */
public class LinearSearch {
    public static void main(String[] args) {
        int[] numbers = {4, 8, 15, 16, 23, 42};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number to search for: ");
        int target = scanner.nextInt();

        int foundIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                foundIndex = i;
                break;
            }
        }

        if (foundIndex != -1) {
            System.out.println("Element found at index " + foundIndex);
        } else {
            System.out.println("Element not found in the array");
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - Linear search checks each element one by one from the start until
 *   it finds the target or reaches the end of the array.
 * - It works on both sorted and unsorted arrays, but can be slow for
 *   very large arrays compared to methods like binary search.
 */
