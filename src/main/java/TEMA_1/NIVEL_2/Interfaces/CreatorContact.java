package TEMA_1.NIVEL_2.Interfaces;

import TEMA_1.NIVEL_2.Address.Address;
import TEMA_1.NIVEL_2.Phone.Phone;

public interface CreatorContact {
    Phone createPhone(String number);
    Address createAddress(String street, int number, String city, String postalCode);
}
