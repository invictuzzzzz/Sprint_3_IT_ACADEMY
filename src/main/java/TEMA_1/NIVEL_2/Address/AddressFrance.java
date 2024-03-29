package TEMA_1.NIVEL_2.Address;

public class AddressFrance implements Address {
    private String street;
    private int number;
    private String city;
    private String postalCode;
    private final String COUNTRY = "France";

    public AddressFrance(String street, int number, String city, String postalCode) {
        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }

    @Override
    public void getFullAddress() {
        System.out.println("C/ " + this.street + " " + this.number + ", " + this.postalCode + " "
                + this.city + ", " + COUNTRY);
    }
}
