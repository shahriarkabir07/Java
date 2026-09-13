/*
 * Problem: Combine OOP and Exception Handling by creating a custom
 * exception (InsufficientBalanceException) that a BankAccount class
 * throws when someone tries to withdraw more money than is available.
 *
 * Example Input:
 * Balance = 1000, withdraw 1500
 *
 * Example Output:
 * Withdrawal failed: Insufficient balance. Available: 1000.0, Requested: 1500.0
 * Current balance remains: 1000.0
 */
class BankAccount {
    private double balance;

    public BankAccount(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    // "throws" declares that this method might throw a checked exception
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(
                "Insufficient balance. Available: " + balance + ", Requested: " + amount
            );
        }
        balance -= amount;
    }
}

public class BankAccountWithException {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(1000);

        try {
            account.withdraw(1500);
            System.out.println("Withdrawal successful. New balance: " + account.getBalance());

        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal failed: " + e.getMessage());
            System.out.println("Current balance remains: " + account.getBalance());
        }
    }
}

/*
 * Explanation:
 * - InsufficientBalanceException is a custom exception class we created
 *   by extending Exception, so it can carry a specific, meaningful name
 *   and message about what went wrong in our banking domain.
 * - The withdraw() method uses "throw" to raise the exception when the
 *   business rule (enough balance) is violated.
 * - The caller in main() must catch InsufficientBalanceException (or
 *   declare it too), which forces the program to handle this error case
 *   instead of ignoring it.
 */
