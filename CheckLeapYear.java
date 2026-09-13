import java.util.Scanner;

/*
 * Problem: Check whether a given year is a leap year.
 * A year is a leap year if it is divisible by 4, but not by 100,
 * unless it is also divisible by 400.
 *
 * Example Input:
 * 2024
 *
 * Example Output:
 * 2024 is a Leap Year
 */
public class CheckLeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a year: ");
        int year = scanner.nextInt();

        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

        if (isLeapYear) {
            System.out.println(year + " is a Leap Year");
        } else {
            System.out.println(year + " is not a Leap Year");
        }

        scanner.close();
    }
}

/*
 * Explanation:
 * - Divisible by 4 AND not divisible by 100 -> leap year (e.g. 2024).
 * - Divisible by 400 -> always a leap year, even if divisible by 100
 *   (e.g. 2000).
 * - Combining both conditions with OR (||) covers every leap year rule.
 */
