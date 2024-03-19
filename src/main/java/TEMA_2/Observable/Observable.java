package TEMA_2.Observable;

import TEMA_2.Observer.Observer;

public interface Observable {

    void addObserver(Observer observer);

    void deleteObserver(Observer observer);

    void notifyObserversMarketRise();
    void notifyObserverMarketDecline();
}
