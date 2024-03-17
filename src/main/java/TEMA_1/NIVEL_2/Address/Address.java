package TEMA_1.NIVEL_2.Address;

import TEMA_1.NIVEL_2.Contact.Contact;
import TEMA_1.NIVEL_2.Interfaces.IAddress;

public abstract class Address implements IAddress {
    private String street;
    private int number;
    private String city;
    private String postalCode;




    public Address(String street, int number, String city , String postalCode){

        this.street = street;
        this.number = number;
        this.city = city;
        this.postalCode = postalCode;
    }


    public String getStreet() {
        return street;
    }

    public int getNumber() {
        return number;
    }

    public String getCity() {
        return city;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public String getFullAddress() {
        return street + " " + number + " from " + city + "\n" +
                "Postal Code: " + postalCode;
    }

    @Override
    public abstract String toString();
}
