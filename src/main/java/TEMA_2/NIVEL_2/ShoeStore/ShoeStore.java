package TEMA_2.NIVEL_2.ShoeStore;

import TEMA_2.NIVEL_2.PayMethods.BankTransfer;
import TEMA_2.NIVEL_2.PayMethods.CreditCard;
import TEMA_2.NIVEL_2.PayMethods.PaymentCallback;
import TEMA_2.NIVEL_2.PayMethods.Paypal;
import TEMA_2.NIVEL_2.Remote.Remote;

public class ShoeStore {

    private static ShoeStore instance;
    private static Remote remote;

    static {
        remote = new Remote();
    }

    private String storeName;

    private ShoeStore() {
        this.storeName = "Zapatos de Albacete";
    }

    public static ShoeStore getInstance() {
        if (instance == null) {
            instance = new ShoeStore();
        }
        return instance;
    }

    public String getStoreName() {
        return storeName;
    }

    public void processMethod(int option) {

        switch (option) {
            case 1:
                callRemote(new CreditCard());
                break;
            case 2:
                callRemote(new Paypal());
                break;
            case 3:
                callRemote(new BankTransfer());
                break;
            default:
                System.out.println("Choose a correct option.");
        }
    }

    private void callRemote(PaymentCallback pay) {
        remote.executeCallback(pay);
    }
}
