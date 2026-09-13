import java.util.Scanner;

/*
 * Problem: Print the multiplication table of a given number up to 10.
 *
 * Example Input:
 * 4
 *
 * Example Output:
 * 4 x 1 = 4
 * 4 x 2 = 8
 * ...
 * 4 x 10 = 40
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - The loop variable i runs from 1 to 10.
 * - On each iteration we print "number x i = result", where result is
 *   simply number multiplied by i.
 */
