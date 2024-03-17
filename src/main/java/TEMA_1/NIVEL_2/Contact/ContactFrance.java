package TEMA_1.NIVEL_2.Contact;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Address.AddressFrance;
import TEMA_1.NIVEL_2.Phone.Phone;
import TEMA_1.NIVEL_2.Phone.PhoneFr;

public class ContactFrance implements CreatorContact {

    @Override
    public Phone createPhone(String number) {
        return new PhoneFr(number);
    }

    @Override
    public Address createAddress(String street, int number, String city, String postalCode) {
        return new AddressFrance(street, number, city, postalCode);
    }
}
