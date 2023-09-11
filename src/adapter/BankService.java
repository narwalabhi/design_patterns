package adapter;

public class BankService {

    private final BankAPIAdapter bankAPIAdapter;

    public BankService(BankName bankName) {
        this.bankAPIAdapter = BankAdapterFactory.getBankAPIAdapter(bankName);
    }

    public int balance(String accountNumber) {
        return bankAPIAdapter.balance(accountNumber);
    }

    public boolean pay(String accountNumber, double amount, String toAccountNumber) {
        return bankAPIAdapter.pay(accountNumber, amount, toAccountNumber);
    }

    public boolean withdraw(String accountNumber, double amount) {
        return bankAPIAdapter.withdraw(accountNumber, amount);
    }

    public boolean deposit(String accountNumber, double amount) {
        return bankAPIAdapter.deposit(accountNumber, amount);
    }

}
