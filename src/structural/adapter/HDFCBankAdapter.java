package structural.adapter;

import structural.adapter.thirdPartyBank.HDFCBankAPI;

public class HDFCBankAdapter implements BankAPIAdapter {

    private final HDFCBankAPI hdfcBankAPI;

    public HDFCBankAdapter() {
        this.hdfcBankAPI = new HDFCBankAPI();
    }

    @Override
    public int balance(String accountNumber) {
        return (int) hdfcBankAPI.getBalance(accountNumber);
    }

    @Override
    public boolean pay(String accountNumber, double amount, String toAccountNumber) {
        return hdfcBankAPI.payMoney(accountNumber, amount) == 'Y';
    }

    @Override
    public boolean withdraw(String accountNumber, double amount) {
        return hdfcBankAPI.withdrawMoney(accountNumber, amount).equals("Y");
    }

    @Override
    public boolean deposit(String accountNumber, double amount) {
        return hdfcBankAPI.depositMoney(accountNumber, amount);
    }
}
