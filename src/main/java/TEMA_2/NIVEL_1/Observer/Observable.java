package TEMA_2.NIVEL_1.Observer;

import TEMA_2.NIVEL_1.Observable.Observer;

public interface Observable {

    void addObservable(Observer observer);

    void deleteObservable(Observer observer);

    void showObservables();

    void notifyObservableMarketRise();

    void notifyObservableMarketDecline();

}
