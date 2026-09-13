# ☕ Java Problems & Solutions

**Author:** Shahriar Kabir

A beginner-friendly collection of Java programming problems and solutions,
organized by topic, for anyone learning Java from the ground up. Every
problem includes a clear statement, example input/output, a simple working
solution, and a short explanation of *why* it works.

---

## 📖 About the Repository

This repository is built for students and self-learners who want to
practice core Java concepts one small, focused problem at a time — instead
of digging through one giant file of unrelated code. Each problem lives in
its own runnable `.java` file, with the explanation written directly into
the code as comments, so you can read, run, and modify it immediately.

**Design principles used throughout this repo:**
- Simple, beginner-friendly logic — no unnecessary advanced tricks
- Meaningful variable and class names
- Every program is independently runnable
- `Scanner` is used for input where it makes sense
- No external libraries — just core Java (JDK)
- One problem per file (never everything crammed into one giant file)

---

## 🗂️ Topics Covered

| Folder | Topic |
|---|---|
| `01-Basics` | Variables, I/O, program structure |
| `02-Conditionals` | `if` / `else if` / `else` |
| `03-Loops` | `for`, `while`, nested loops |
| `04-Methods` | Methods, overloading, recursion |
| `05-Arrays` | Traversal, searching, sorting |
| `06-Strings` | String manipulation |
| `07-OOP` | Encapsulation, Inheritance, Polymorphism, Abstraction |
| `08-Exception-Handling` | `try/catch/finally`, custom exceptions |
| `09-File-Handling` | Reading & writing files |
| `10-Collections` | `ArrayList`, `HashMap` |

---

## 🪜 Difficulty Levels

Problems in every folder are ordered from **easiest to hardest**, so you
can work through a folder top-to-bottom:

- 🟢 **Easy** — first 1–2 problems in each folder (core syntax)
- 🟡 **Medium** — middle problems (combining a couple of concepts)
- 🔴 **Harder** — last problem(s) in each folder (multiple concepts, edge cases)

---

## 📁 Repository Structure

```text
Java-Problems/
├── 01-Basics/
├── 02-Conditionals/
├── 03-Loops/
├── 04-Methods/
├── 05-Arrays/
├── 06-Strings/
├── 07-OOP/
│   ├── Encapsulation/
│   ├── Inheritance/
│   ├── Polymorphism/
│   └── Abstraction/
├── 08-Exception-Handling/
├── 09-File-Handling/
├── 10-Collections/
└── README.md
```

Every topic folder also contains its own `README.md` with a table listing
that folder's problems and the concept each one demonstrates.

---

## ▶️ How to Run a Java Program

You need a Java Development Kit (JDK 8 or newer) installed. Then, from a
terminal:

```bash
# 1. Go into the folder containing the problem
cd 01-Basics

# 2. Compile the file
javac HelloWorld.java

# 3. Run the compiled program
java HelloWorld
```

For problems made of more than one file (for example, a custom exception
class used by another class), compile them together:

```bash
cd 08-Exception-Handling
javac BankAccountWithException.java InsufficientBalanceException.java
java BankAccountWithException
```

> 💡 Tip: You can also open this folder in an IDE like IntelliJ IDEA,
> Eclipse, or VS Code (with the Java extension) and run any file directly.

---

## 🗺️ Learning Roadmap

If you are new to Java, work through the folders in this order:

1. **01-Basics** — get comfortable with syntax, variables, and printing/reading input
2. **02-Conditionals** — learn to make decisions in code
3. **03-Loops** — learn to repeat actions
4. **04-Methods** — learn to organize code into reusable blocks
5. **05-Arrays** — learn to work with collections of data
6. **06-Strings** — learn to manipulate text
7. **07-OOP** — learn to model real-world things with classes and objects
8. **08-Exception-Handling** — learn to handle errors gracefully
9. **09-File-Handling** — learn to read and write files
10. **10-Collections** — learn to use `ArrayList` and `HashMap` for flexible data storage

---

## 🧱 OOP Concepts Covered

The `07-OOP` folder (plus the custom-exception example in
`08-Exception-Handling`) walks through every core OOP idea with a small,
practical example:

| Concept | Where to find it |
|---|---|
| Class & Object | `07-OOP/Encapsulation/BankAccount.java` |
| Constructor (incl. overloading) | `07-OOP/Encapsulation/Student.java` |
| Encapsulation | `07-OOP/Encapsulation/BankAccount.java` |
| Inheritance | `07-OOP/Inheritance/AnimalInheritance.java` |
| Method Overloading | `07-OOP/Polymorphism/CalculatorOverloading.java` |
| Method Overriding | `07-OOP/Inheritance/AnimalInheritance.java` |
| Runtime Polymorphism | `07-OOP/Polymorphism/ShapeRuntimePolymorphism.java` |
| Abstract Class | `07-OOP/Abstraction/AbstractShapeArea.java` |
| Interface | `07-OOP/Abstraction/InterfacePaymentMethod.java` |
| Composition / Aggregation | `07-OOP/Inheritance/CarEngineComposition.java` |
| Exception Handling with OOP | `08-Exception-Handling/BankAccountWithException.java` |

---

## 🧩 Sample Problem

**Problem:** Find the largest of three numbers.

**Input:**
```
10 25 15
```

**Output:**
```
Largest = 25
```

**Solution:** (`02-Conditionals/LargestOfThreeNumbers.java`)
```java
import java.util.Scanner;

public class LargestOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

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
```

**Explanation:** We compare each number against the other two. A number is
the largest only if it is greater than or equal to both of the others.

---

## 🙋 Author

**Shahriar Kabir**

If this repository helped you learn Java, consider giving it a ⭐ on GitHub!

Contributions, suggestions, and pull requests to add more beginner-friendly
problems are welcome.
