/*
 * Problem: Create a BankAccount class that demonstrates Encapsulation:
 * keep the balance private and only allow it to change through
 * controlled methods (deposit/withdraw) that include validation.
 * Also demonstrates a Class, Object, and Constructor.
 *
 * Example Input:
 * Open account for "Rahim" with 1000 balance, deposit 500, withdraw 200.
 *
 * Example Output:
 * Account holder: Rahim
 * Balance after deposit: 1500.0
 * Balance after withdrawal: 1300.0
 * Withdrawal denied: insufficient funds
 */
public class BankAccount {

    // private fields cannot be accessed directly from outside the class
    private String accountHolder;
    private double balance;

    // Constructor: runs when a new BankAccount object is created
    public BankAccount(String accountHolder, double initialBalance) {
        this.accountHolder = accountHolder;
        this.balance = initialBalance;
    }

    // Public getter: controlled read access to the private field
    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    // Public method with validation: controlled write access
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be positive.");
            return;
        }
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be positive.");
            return;
        }
        if (amount > balance) {
            System.out.println("Withdrawal denied: insufficient funds");
            return;
        }
        balance -= amount;
    }

    public static void main(String[] args) {
        // Creating an object of BankAccount using the constructor
        BankAccount account = new BankAccount("Rahim", 1000);

        System.out.println("Account holder: " + account.getAccountHolder());

        account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());

        account.withdraw(200);
        System.out.println("Balance after withdrawal: " + account.getBalance());

        account.withdraw(5000); // will be denied due to insufficient funds
    }
}

/*
 * Explanation:
 * - Encapsulation means hiding internal data (private fields) and only
 *   exposing safe, controlled ways to read or change it (public methods).
 * - Nobody outside this class can do "account.balance = -999;" directly,
 *   because "balance" is private. They must go through deposit()/withdraw(),
 *   which validate the amount first.
 * - The constructor BankAccount(String, double) sets up a new object's
 *   initial state when it is created with the "new" keyword.
 */
