package TEMA_1.NIVEL_2.Contact;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Phone.Phone;

public class Contact {
    private String name;
    private Phone phone;
    private Address address;

    public Contact(String name, Phone phone, Address address) {
        this.name = name;
        this.phone = phone;
        this.address = address;

    }

    public Phone getPhone() {
        return phone;
    }

    public Address getAddress() {
        return address;
    }

    public void call() {
        phone.call();
    }
    public void getFullAddress(){
        address.getFullAddress();
    }

    public String getName() {
        return name;
    }
}

