import java.util.ArrayList;

/*
 * Problem: Demonstrate basic ArrayList operations: adding, removing,
 * searching, and iterating over elements.
 *
 * Example Input:
 * Add: Apple, Banana, Mango, Orange. Then remove Banana.
 *
 * Example Output:
 * Fruits: [Apple, Banana, Mango, Orange]
 * After removing Banana: [Apple, Mango, Orange]
 * Contains Mango? true
 * Total fruits: 3
 */
public class ArrayListBasics {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Mango");
        fruits.add("Orange");

        System.out.println("Fruits: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing Banana: " + fruits);

        boolean hasMango = fruits.contains("Mango");
        System.out.println("Contains Mango? " + hasMango);

        System.out.println("Total fruits: " + fruits.size());

        System.out.println("Iterating with a for-each loop:");
        for (String fruit : fruits) {
            System.out.println("- " + fruit);
        }
    }
}

/*
 * Explanation:
 * - ArrayList is a resizable array from java.util; unlike a normal array,
 *   it can grow or shrink automatically as elements are added or removed.
 * - add() appends an element, remove() deletes the first matching element,
 *   contains() checks whether a value exists, and size() returns the
 *   current number of elements.
 * - The diamond operator <> in "new ArrayList<>()" lets Java infer the
 *   type (String) from the left side of the declaration.
 */
