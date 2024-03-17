package TEMA_1.NIVEL_2.Phone;

import TEMA_1.NIVEL_2.Interfaces.Iphone;

public class PhoneFr extends Phone implements Iphone {

    private final String PREFIX = "+33 ";

    public PhoneFr (String numberPhone) {
        super(numberPhone);
    }

    @Override
    public void call() {
        System.out.println("Calling to the phone " + PREFIX + getNumberPhone());

    }

    @Override
    public void prefix() {
        System.out.println(PREFIX);
    }
}
