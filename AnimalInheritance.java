/*
 * Problem: Demonstrate Inheritance by creating a base class Animal and
 * two subclasses, Dog and Cat, that inherit its properties and override
 * its behavior.
 *
 * Example Input:
 * Create a Dog named "Tommy" and a Cat named "Whiskers".
 *
 * Example Output:
 * Tommy is an Animal and says: Woof Woof
 * Whiskers is an Animal and says: Meow Meow
 */
class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeSound() {
        System.out.println(name + " makes a generic animal sound");
    }
}

// Dog inherits from Animal using the "extends" keyword
class Dog extends Animal {
    public Dog(String name) {
        super(name); // calls the Animal constructor
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is an Animal and says: Woof Woof");
    }
}

class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println(name + " is an Animal and says: Meow Meow");
    }
}

public class AnimalInheritance {
    public static void main(String[] args) {
        Dog dog = new Dog("Tommy");
        Cat cat = new Cat("Whiskers");

        dog.makeSound();
        cat.makeSound();
    }
}

/*
 * Explanation:
 * - "class Dog extends Animal" means Dog inherits all non-private fields
 *   and methods from Animal, and can add or override its own behavior.
 * - super(name) calls the parent class's constructor to set up the
 *   inherited "name" field.
 * - @Override marks that makeSound() is replacing (overriding) the
 *   parent's version with a more specific one.
 */
