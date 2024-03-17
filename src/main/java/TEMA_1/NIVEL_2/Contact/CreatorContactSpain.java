package TEMA_1.NIVEL_2.Contact;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Address.AddressEs;
import TEMA_1.NIVEL_2.Phone.Phone;
import TEMA_1.NIVEL_2.Phone.PhoneEs;

public class CreatorContactSpain implements CreatorContact {

    @Override
    public Phone createPhone(String number) {
        return new PhoneEs(number);
    }

    @Override
    public Address createAddress(String street, int number, String city, String postalCode) {
        return new AddressEs(street, number, city, postalCode);
    }
}
