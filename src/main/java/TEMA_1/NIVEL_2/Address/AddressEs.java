package TEMA_1.NIVEL_2.Address;

import TEMA_1.NIVEL_2.Interfaces.IAddress;

public class AddressEs extends Address implements IAddress {

    private final String COUNTRY = "Spain";

    public AddressEs(String street, int number, String city, String postalCode) {
        super(street, number, city, postalCode);
    }

    @Override
    public String toString() {
        return "Contacto de la agenda española. \n" +
                "Con una dirección en : \n" +
                this.getFullAddress() + " país " + COUNTRY ;
    }

    @Override
    public void contact() {
        System.out.println("Hola que tal?");
    }

}
