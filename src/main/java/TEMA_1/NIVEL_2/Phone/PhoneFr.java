package TEMA_1.NIVEL_2.Phone;



public class PhoneFr implements Phone {
    String numberPhone;

    private final String PREFIX = "+33 ";

    public PhoneFr(String numberPhone) {
        this.numberPhone = numberPhone;
    }

    @Override
    public void call() {
        System.out.println("Calling to the phone " + PREFIX + this.numberPhone);
    }
}
