import java.io.FileWriter;
import java.io.IOException;

/*
 * Problem: Write some text to a file using FileWriter.
 *
 * Example Input:
 * (text is defined inside the program)
 *
 * Example Output:
 * Successfully wrote to notes.txt
 */
public class WriteToFile {
    public static void main(String[] args) {
        String fileName = "notes.txt";
        String content = "Java File Handling is easy to learn.\nThis line was written by WriteToFile.java";

        // try-with-resources automatically closes the FileWriter when done
        try (FileWriter writer = new FileWriter(fileName)) {
            writer.write(content);
            System.out.println("Successfully wrote to " + fileName);

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file: " + e.getMessage());
        }
    }
}

/*
 * Explanation:
 * - FileWriter is used to write character data to a file. If the file
 *   does not exist, it is created automatically; if it exists, its
 *   content is replaced by default.
 * - "try-with-resources" (the try(...) syntax) automatically closes the
 *   FileWriter after use, even if an error occurs, preventing resource leaks.
 * - IOException must be handled because file operations can fail (for
 *   example, if there is no permission to write to the disk).
 */
