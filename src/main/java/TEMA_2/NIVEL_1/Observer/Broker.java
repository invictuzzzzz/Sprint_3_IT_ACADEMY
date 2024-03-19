package TEMA_2.NIVEL_1.Observer;

import TEMA_2.NIVEL_1.Observable.Observer;

import java.util.HashSet;
import java.util.Set;

public class Broker implements Observable {

    String name;
    private static Set<Observer> observerSet = new HashSet<>();

    public Broker(String name) {
        this.name = name;
    }


    public String getName() {
        return name;
    }

    @Override
    public void addObservable(Observer observer) {
        observerSet.add(observer);

    }

    @Override
    public void deleteObservable(Observer observer) {
        observerSet.remove(observer);
    }

    @Override
    public void showObservables() {
        System.out.println("Observadores conectados al intermediario:");

        int i = 1;
        for (Observer observer : observerSet) {
            System.out.println(i++ + ") " + observer.getName());
        }
    }


    @Override
    public void notifyObservableMarketRise() {
        for (Observer observer : observerSet) {
            observer.marketRise();
        }
    }

    @Override
    public void notifyObservableMarketDecline() {

        for (Observer observer : observerSet) {
            observer.marketDecline();
        }
    }
}
