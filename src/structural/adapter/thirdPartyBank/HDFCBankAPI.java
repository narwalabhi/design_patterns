package structural.adapter.thirdPartyBank;

import java.util.Random;

public class HDFCBankAPI {

    private final Random random = new Random();

    public double getBalance(String accountNumber) {
        return random.nextDouble();
    }

    public char payMoney(String accountNumber, double amount) {
        System.out.println("Paid " + amount + " to " + accountNumber);
        return random.nextBoolean() ? 'Y' : 'N';
    }

    public String withdrawMoney(String accountNumber, double amount) {
        System.out.println("Withdrew " + amount + " from " + accountNumber);
        return random.nextBoolean() ? "Y" : "N";
    }

    public boolean depositMoney(String accountNumber, double amount) {
        System.out.println("Deposited " + amount + " to " + accountNumber);
        return random.nextBoolean();
    }

}
