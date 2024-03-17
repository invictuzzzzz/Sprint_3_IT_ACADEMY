package TEMA_1.NIVEL_2.Address;

import TEMA_1.NIVEL_2.Interfaces.IAddress;

public class AddressFrance extends Address implements IAddress {

    private final String COUNTRY = "France";

    public AddressFrance(String street, int number, String city, String postalCode) {
        super(street, number, city, postalCode);
    }

    @Override
    public String toString() {
        return "Contacto de la agenda francesa. \n" +
                "Con una dirección en : \n" +
                this.getFullAddress() + " país " + COUNTRY;
    }

    @Override
    public void contact() {
        System.out.println("Salut, ça va?");
    }

}
