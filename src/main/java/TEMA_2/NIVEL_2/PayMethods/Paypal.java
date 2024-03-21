package TEMA_2.NIVEL_2.PayMethods;

public class Paypal implements PaymentCallback{


    static {
        System.out.println("Connecting with Paypal....... Paypal payment complete.");
    }


    @Override
    public void execute() {
        System.out.println("Executing payment by Paypal account.");
    }
}
