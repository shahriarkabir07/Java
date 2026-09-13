import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Problem: Read and print the contents of a text file line by line.
 * This program pairs with WriteToFile.java; run WriteToFile.java first
 * to generate notes.txt.
 *
 * Example Input:
 * notes.txt containing:
 * Java File Handling is easy to learn.
 * This line was written by WriteToFile.java
 *
 * Example Output:
 * Line 1: Java File Handling is easy to learn.
 * Line 2: This line was written by WriteToFile.java
 */
public class ReadFromFile {
    public static void main(String[] args) {
        String fileName = "notes.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            int lineNumber = 1;

            while ((line = reader.readLine()) != null) {
                System.out.println("Line " + lineNumber + ": " + line);
                lineNumber++;
            }

        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
            System.out.println("Tip: run WriteToFile.java first to create notes.txt");
        }
    }
}

/*
 * Explanation:
 * - BufferedReader wraps a FileReader and reads text efficiently, one
 *   line at a time, using readLine().
 * - readLine() returns null when the end of the file is reached, which
 *   is how the while loop knows when to stop.
 * - Just like writing, reading a file can throw an IOException (for
 *   example, if the file does not exist), so we handle it with try/catch.
 */
