import java.util.Scanner;

/*
 * Problem: Write methods to convert Celsius to Fahrenheit and Fahrenheit
 * to Celsius.
 *
 * Example Input:
 * Celsius: 100
 *
 * Example Output:
 * 100.0 C = 212.0 F
 */
public class TemperatureConverter {

    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = celsiusToFahrenheit(celsius);
        System.out.println(celsius + " C = " + fahrenheit + " F");

        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheitInput = scanner.nextDouble();

        double celsiusResult = fahrenheitToCelsius(fahrenheitInput);
        System.out.println(fahrenheitInput + " F = " + celsiusResult + " C");

        scanner.close();
    }
}

/*
 * Explanation:
 * - Each conversion formula is placed inside its own method, which keeps
 *   the code organized and reusable.
 * - main() simply reads the input and calls the correct method,
 *   without needing to know how the formula works internally.
 */
