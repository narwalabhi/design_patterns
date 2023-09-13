package structural.adapter.thirdPartyBank;

import java.util.Random;

public class YesBankAPI {

    private final Random random = new Random();

    public int balance(String accountNumber) {
        return random.nextInt(100000);
    }

    public boolean pay(String accountNumber, double amount, String toAccountNumber) {
        System.out.println("Paid " + amount + " to " + accountNumber);
        return random.nextBoolean();
    }

    public char withdraw(String accountNumber, double amount) {
        System.out.println("Withdrew " + amount + " from " + accountNumber);
        return random.nextBoolean() ? 'Y' : 'N';
    }

    public String deposit(String accountNumber, double amount) {
        System.out.println("Deposited " + amount + " to " + accountNumber);
        return random.nextBoolean() ? "Success" : "Failed";
    }

}
