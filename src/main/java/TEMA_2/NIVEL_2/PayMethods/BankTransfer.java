package TEMA_2.NIVEL_2.PayMethods;

public class BankTransfer implements PaymentCallback{


    static {
        System.out.println("Connecting with Bank....... Transfer is complete");
    }

    @Override
    public void execute() {
        System.out.println("Executing payment with BankTransfer");

    }
}
