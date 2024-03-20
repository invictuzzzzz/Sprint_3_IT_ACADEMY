package TEMA_2.NIVEL_1.Observer;

import TEMA_2.NIVEL_1.Observable.Observer;

public interface Observable {

    void addObservable(String key, Observer observer);

    void deleteObservableByKey(String key);

    void showObservables();

    void notifyObservableMarketRise();

    void notifyObservableMarketDecline();

}
