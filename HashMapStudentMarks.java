import java.util.HashMap;
import java.util.Map;

/*
 * Problem: Use a HashMap to store student names as keys and their marks
 * as values, then look up and display the data.
 *
 * Example Input:
 * Alice = 85, Bob = 92, Charlie = 78
 *
 * Example Output:
 * Alice -> 85
 * Bob -> 92
 * Charlie -> 78
 * Bob's marks: 92
 * Is David in the map? false
 */
public class HashMapStudentMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> studentMarks = new HashMap<>();

        studentMarks.put("Alice", 85);
        studentMarks.put("Bob", 92);
        studentMarks.put("Charlie", 78);

        // Iterating over all key-value pairs
        for (Map.Entry<String, Integer> entry : studentMarks.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }

        // Looking up a specific value by key
        int bobsMarks = studentMarks.get("Bob");
        System.out.println("Bob's marks: " + bobsMarks);

        // Checking if a key exists
        boolean hasDavid = studentMarks.containsKey("David");
        System.out.println("Is David in the map? " + hasDavid);
    }
}

/*
 * Explanation:
 * - A HashMap stores data as key-value pairs; here, each student name
 *   (key) maps to their marks (value).
 * - put() adds or updates a pair, get() retrieves the value for a key,
 *   and containsKey() checks whether a key already exists.
 * - entrySet() combined with a for-each loop is a common way to go
 *   through every key-value pair stored in the map.
 */
