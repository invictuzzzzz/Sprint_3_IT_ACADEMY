package TEMA_1.NIVEL_2.Phone;

public class PhoneGe implements Phone {
    String numberPhone;

    private final String PREFIX = "+63 ";

    public PhoneGe(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public void call() {
        System.out.println("Calling to the phone " + PREFIX + this.numberPhone);

    }
}
