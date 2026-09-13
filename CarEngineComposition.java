/*
 * Problem: Demonstrate Composition (a "has-a" relationship) by creating
 * a Car class that contains (owns) an Engine object, instead of
 * inheriting from it.
 *
 * Example Input:
 * Create a Car with a 1500cc Engine and start it.
 *
 * Example Output:
 * Engine with 1500cc started.
 * Car is ready to drive!
 */
class Engine {
    private int capacityCC;

    public Engine(int capacityCC) {
        this.capacityCC = capacityCC;
    }

    public void start() {
        System.out.println("Engine with " + capacityCC + "cc started.");
    }
}

// Car "has-a" Engine (Composition): Car cannot exist meaningfully without its own Engine
class Car {
    private String model;
    private Engine engine; // Car is composed of an Engine

    public Car(String model, int engineCapacityCC) {
        this.model = model;
        this.engine = new Engine(engineCapacityCC); // Engine is created inside Car
    }

    public void drive() {
        engine.start();
        System.out.println("Car is ready to drive!");
    }
}

public class CarEngineComposition {
    public static void main(String[] args) {
        Car car = new Car("Sedan", 1500);
        car.drive();
    }
}

/*
 * Explanation:
 * - Composition means one class contains an instance of another class as
 *   a field, forming a "has-a" relationship (a Car "has-a" Engine).
 * - Here, the Engine object's lifetime is tied to the Car: it is created
 *   inside the Car constructor and cannot be shared with another Car.
 * - This is different from Inheritance ("is-a"): a Car is not a type of
 *   Engine, so composition is the correct design choice here.
 */
