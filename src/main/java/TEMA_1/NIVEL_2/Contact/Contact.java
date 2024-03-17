package TEMA_1.NIVEL_2.Contact;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Interfaces.CreatorContact;
import TEMA_1.NIVEL_2.Phone.Phone;

public class Contact {

    private Phone phone;
    private Address address;
    private String name;

    public Contact(CreatorContact creator, String phoneNumber, String street, int number, String city, String postalCode, String name) {
        phone = creator.createPhone(phoneNumber);
        address = creator.createAddress(street, number, city, postalCode);
        this.name = name;
    }

    @Override
    public String toString() {
        return  name + ":\n" +  address.toString();
    }
    public void call(){
        phone.call();
    }
    public void contact() {
        address.contact();
    }
}

