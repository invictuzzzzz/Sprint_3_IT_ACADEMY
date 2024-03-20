package TEMA_2.NIVEL_2.Remote;

import TEMA_2.NIVEL_2.PayMethods.PaymentCallback;

public class Remote {

    public void executeCallback(PaymentCallback pay) {
        pay.execute();
    }
}
