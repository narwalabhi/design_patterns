package adapter;

public class BankAdapterFactory {

    public static BankAPIAdapter getBankAPIAdapter(BankName bank) {
        return switch (bank){
            case YES_BANK -> new YesBankAdapter();
            case HDFC -> new HDFCBankAdapter();
        };
    }

}
