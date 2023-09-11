package adapter;

public interface BankAPIAdapter {

    int balance(String accountNumber);
    boolean pay(String accountNumber, double amount, String toAccountNumber);

    boolean withdraw(String accountNumber, double amount);

    boolean deposit(String accountNumber, double amount);

}
