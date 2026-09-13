import java.util.Scanner;

/*
 * Problem: Calculate a student's grade based on marks (out of 100)
 * using multiple else-if conditions.
 *
 * Example Input:
 * 82
 *
 * Example Output:
 * Grade = A
 */
public class GradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter marks (0-100): ");
        int marks = scanner.nextInt();

        char grade;
        if (marks >= 90) {
            grade = 'A';
        } else if (marks >= 80) {
            grade = 'A';
        } else if (marks >= 70) {
            grade = 'B';
        } else if (marks >= 60) {
            grade = 'C';
        } else if (marks >= 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade = " + grade);

        scanner.close();
    }
}

/*
 * Explanation:
 * - The if / else-if chain checks ranges from the highest score downward.
 * - As soon as one condition matches, the rest are skipped, so the order
 *   of the ranges matters.
 */
