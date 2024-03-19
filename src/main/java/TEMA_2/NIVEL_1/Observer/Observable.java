package TEMA_2.NIVEL_1.Observer;

import TEMA_2.NIVEL_1.Observable.Observer;

public interface Observable {

    void addObservable(Integer key, Observer observer);



    void deleteObservableByKey(int key);

    void showObservables();

    void notifyObservableMarketRise();

    void notifyObservableMarketDecline();

}
