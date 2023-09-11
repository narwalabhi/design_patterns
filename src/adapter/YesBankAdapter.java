package adapter;

import adapter.thirdPartyBank.YesBankAPI;

public class YesBankAdapter implements BankAPIAdapter {
    private final YesBankAPI yesBankAPI;

    public YesBankAdapter() {
        this.yesBankAPI = new YesBankAPI();
    }

    @Override
    public int balance(String accountNumber) {
        return yesBankAPI.balance(accountNumber);
    }

    @Override
    public boolean pay(String accountNumber, double amount, String toAccountNumber) {
        return yesBankAPI.pay(accountNumber, amount, toAccountNumber);
    }

    @Override
    public boolean withdraw(String accountNumber, double amount) {
        return yesBankAPI.withdraw(accountNumber, amount) == 'Y';
    }

    @Override
    public boolean deposit(String accountNumber, double amount) {
        return yesBankAPI.deposit(accountNumber, amount).equals("Success");
    }
}
