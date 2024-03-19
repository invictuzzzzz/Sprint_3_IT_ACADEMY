package TEMA_2.NIVEL_1.Observer;

import TEMA_2.NIVEL_1.Observable.Observer;

import java.util.HashMap;
import java.util.Map;

public class Broker implements Observable {

    private String name;
    private Map<Integer, Observer> observerMap = new HashMap<>();

    public Broker(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public void addObservable(Integer key, Observer observer) {
        observerMap.put(key, observer);
    }

    @Override
    public void deleteObservableByKey(int key) {
        String name = observerMap.get(key).getName();
        for (Map.Entry<Integer, Observer> entry : observerMap.entrySet()) {
            if (entry.getKey().equals(key)) {
                observerMap.remove(key);
                System.out.println("Agencia '" + name + "' eliminada del servicio.");
                return;
            }
        }
        System.out.println("No se encontró ninguna agencia en la posicion '" + key + "'.");
    }

    @Override
    public void showObservables() {
        System.out.println("Observadores conectados al broker " + name + " :");
        int i = 1;
        for (Map.Entry<Integer, Observer> entry : observerMap.entrySet()) {
            System.out.println(i++ + ") " + entry.getValue().getName());
        }
    }

    @Override
    public void notifyObservableMarketRise() {
        for (Observer observer : observerMap.values()) {
            observer.marketRise();
        }
    }

    @Override
    public void notifyObservableMarketDecline() {
        for (Observer observer : observerMap.values()) {
            observer.marketDecline();
        }
    }
}
