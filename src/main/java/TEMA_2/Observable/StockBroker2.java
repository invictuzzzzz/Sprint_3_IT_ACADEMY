package TEMA_2.Observable;

import TEMA_2.Observer.Observer;

import java.util.HashSet;
import java.util.Set;

public class StockBroker2 implements Observable {
    Set<Observer> observerSet = new HashSet<>();
    @Override
    public void addObserver(Observer observer) {
        observerSet.add(observer);

    }

    @Override
    public void deleteObserver(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void notifyObserversMarketRise() {
        for (Observer observer : observerSet) {
            observer.marketRise();
        }
    }

    @Override
    public void notifyObserverMarketDecline() {

    }
}