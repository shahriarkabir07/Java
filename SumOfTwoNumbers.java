import java.util.Scanner;

/*
 * Problem: Read two integers from the user and print their sum.
 *
 * Example Input:
 * 12 8
 *
 * Example Output:
 * Sum = 20
 */
public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int firstNumber = scanner.nextInt();

        System.out.print("Enter second number: ");
        int secondNumber = scanner.nextInt();

        int sum = firstNumber + secondNumber;
        System.out.println("Sum = " + sum);

        scanner.close();
    }
}

/*
 * Explanation:
 * - Scanner reads user input from the keyboard (System.in).
 * - nextInt() reads the next whole number typed by the user.
 * - We simply add the two variables and print the result.
 */
