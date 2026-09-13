/*
 * Problem: Demonstrate an Interface by defining a Payment contract that
 * different payment methods (Credit Card, Cash) must follow.
 *
 * Example Input:
 * Pay 1500 using Credit Card, then pay 500 using Cash.
 *
 * Example Output:
 * Paid 1500.0 using Credit Card ending in 1234
 * Paid 500.0 using Cash
 */
interface Payment {
    // Interface methods are implicitly public and abstract (no body here)
    void pay(double amount);
}

class CreditCardPayment implements Payment {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay(double amount) {
        String lastFourDigits = cardNumber.substring(cardNumber.length() - 4);
        System.out.println("Paid " + amount + " using Credit Card ending in " + lastFourDigits);
    }
}

class CashPayment implements Payment {
    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Cash");
    }
}

public class InterfacePaymentMethod {
    public static void main(String[] args) {
        Payment payment1 = new CreditCardPayment("5500123412341234");
        Payment payment2 = new CashPayment();

        payment1.pay(1500);
        payment2.pay(500);
    }
}

/*
 * Explanation:
 * - An interface defines a contract (a set of method signatures) that
 *   any implementing class must fulfill using the "implements" keyword.
 * - Unlike an abstract class, an interface cannot hold object state
 *   (traditional instance fields) and every method listed must be
 *   implemented by the class that implements it.
 * - Just like with abstraction, we can use the interface type (Payment)
 *   as a reference, allowing different payment methods to be used
 *   interchangeably wherever a Payment is expected.
 */
