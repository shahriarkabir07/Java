import java.util.Scanner;

/*
 * Problem: Find the largest of three numbers.
 *
 * Example Input:
 * 10 25 15
 *
 * Example Output:
 * Largest = 25
 */
public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter three numbers separated by space: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        int largest;
        if (a >= b && a >= c) {
            largest = a;
        } else if (b >= a && b >= c) {
            largest = b;
        } else {
            largest = c;
        }

        System.out.println("Largest = " + largest);

        scanner.close();
    }
}

/*
 * Explanation:
 * - We compare each number against the other two using if / else if / else.
 * - A number is the largest only if it is greater than or equal to both
 *   of the other numbers.
 */
