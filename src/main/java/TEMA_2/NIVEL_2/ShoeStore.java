package TEMA_2.NIVEL_2;

public class ShoeStore {

    private static ShoeStore instance;
    private PaymentGateWay paymentGateWay = new PaymentGateWay();
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
                paymentGateWay.executeWith(() -> System.out.println("You are paying with Credit Card."));
                break;
            case 2:
                paymentGateWay.executeWith(() -> System.out.println("You are paying with PayPal."));
                break;
            case 3:
                paymentGateWay.executeWith(() -> System.out.println("You are paying with Bank transfer."));
                break;
            default:
                System.out.println("Choose a correct option.");
        }
    }
}
