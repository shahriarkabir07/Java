/*
 * Custom checked exception used by BankAccountWithException.java
 * Extending Exception (not RuntimeException) makes this a "checked"
 * exception, meaning any method that can throw it must declare that
 * with "throws", and callers must handle it.
 */
public class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}
