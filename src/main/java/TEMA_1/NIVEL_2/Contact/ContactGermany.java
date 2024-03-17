package TEMA_1.NIVEL_2.Contact;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Address.AddressGermany;
import TEMA_1.NIVEL_2.Phone.Phone;
import TEMA_1.NIVEL_2.Phone.PhoneGe;

public class ContactGermany implements CreatorContact {

    @Override
    public Phone createPhone(String number) {
        return new PhoneGe(number);
    }

    @Override
    public Address createAddress(String street, int number, String city, String postalCode) {
        return new AddressGermany(street, number, city, postalCode);
    }
}
