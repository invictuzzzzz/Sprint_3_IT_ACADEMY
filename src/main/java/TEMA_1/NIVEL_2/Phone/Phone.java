package TEMA_1.NIVEL_2.Phone;

import TEMA_1.NIVEL_2.Interfaces.Iphone;

public abstract class Phone implements Iphone {

    public String numberPhone;

    public Phone(String numberPhone) {
        this.numberPhone = numberPhone;
    }


    public String getNumberPhone() {
        return numberPhone;
    }

    public abstract void prefix();
}
