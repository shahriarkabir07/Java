/*
 * Problem: Create a Student class with private fields and multiple
 * constructors (constructor overloading) to demonstrate Encapsulation
 * along with flexible object creation.
 *
 * Example Input:
 * Student 1: name = "Ayesha", roll = 12, marks not given yet
 * Student 2: name = "Karim", roll = 15, marks = 88.5
 *
 * Example Output:
 * Name: Ayesha, Roll: 12, Marks: 0.0
 * Name: Karim, Roll: 15, Marks: 88.5
 */
public class Student {

    private String name;
    private int roll;
    private double marks;

    // Constructor 1: name and roll only, marks defaults to 0.0
    public Student(String name, int roll) {
        this.name = name;
        this.roll = roll;
        this.marks = 0.0;
    }

    // Constructor 2 (overloaded): name, roll, and marks all provided
    public Student(String name, int roll, double marks) {
        this.name = name;
        this.roll = roll;
        this.marks = marks;
    }

    public void setMarks(double marks) {
        if (marks < 0 || marks > 100) {
            System.out.println("Invalid marks. Must be between 0 and 100.");
            return;
        }
        this.marks = marks;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Roll: " + roll + ", Marks: " + marks);
    }

    public static void main(String[] args) {
        Student student1 = new Student("Ayesha", 12);
        Student student2 = new Student("Karim", 15, 88.5);

        student1.displayInfo();
        student2.displayInfo();
    }
}

/*
 * Explanation:
 * - Constructor overloading lets us create a Student object in more than
 *   one way, depending on what information is available at the time.
 * - Fields stay private, and marks can only be updated through setMarks(),
 *   which validates the value before accepting it.
 */
