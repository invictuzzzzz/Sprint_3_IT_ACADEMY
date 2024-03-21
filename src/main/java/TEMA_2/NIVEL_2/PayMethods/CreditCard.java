package TEMA_2.NIVEL_2.PayMethods;

public class CreditCard implements PaymentCallback {

    static {
        System.out.println("...Reading CreditCard......CreditCard credentials are OK");
    }
    @Override
    public void execute() {
        System.out.println("Executing payment with Credit Card");

    }
}
