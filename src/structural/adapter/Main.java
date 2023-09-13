package structural.adapter;

public class Main {

    public static void main(String[] args) {
        BankService bankService = new BankService(BankName.HDFC);
        String accountNumber = "1234567890";

        System.out.println(bankService.balance(accountNumber));
        System.out.println(bankService.pay(accountNumber, 1000, "0987654321"));
        System.out.println(bankService.withdraw(accountNumber, 1000));
        System.out.println(bankService.deposit(accountNumber, 1000));
    }

}
