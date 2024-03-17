package TEMA_1.NIVEL_2.Phone;


public class PhoneEs implements Phone {
    String numberPhone;

    private final String PREFIX = "+34 ";

    public PhoneEs(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public void call() {
        System.out.println("Calling to the phone " + PREFIX + this.numberPhone);

    }
}
