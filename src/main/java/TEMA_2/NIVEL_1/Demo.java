package TEMA_2.NIVEL_1;

import TEMA_2.NIVEL_1.Observable.StockBroker;
import TEMA_2.NIVEL_1.Observer.Broker;

import java.util.Scanner;

public class Demo {

    private static Scanner scanner;
    private Broker broker = new Broker("Dani");
    private StockBroker agencyNY = new StockBroker("Agency NewYork");
    private StockBroker agencyLondon = new StockBroker("Agency London");
    private StockBroker agencyBerlin = new StockBroker("Agency Berlin");


    public Demo(Scanner scanner) {
        this.scanner = scanner;

    }

    public void startMenu() {

        int option = 0;

        do {
            printMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    addAgencys();
                    showAgencys();
                    break;
                case 2:
                    broker.notifyObservableMarketRise();
                    break;
                case 3:
                    broker.notifyObservableMarketDecline();
                    break;
                case 4:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 4);
    }

    private void printMenu() {

        System.out.println("\nBienvenido al sistema de notificación de Bolsa.\n" +
                "1. Ver Agencias Subscritas al servicio.\n" +
                "2. Hacer subir la bolsa!\n" +
                "3. Hacer bajar la bolsa!.\n" +
                "4. Salir.");
    }

    private void addAgencys() {
        broker.addObservable(agencyNY);
        broker.addObservable(agencyLondon);
        broker.addObservable(agencyBerlin);
    }

    private void showAgencys() {
        System.out.println("Agencias subcritas al notificador del Broker " + broker.getName() + ":");
        broker.showObservables();

    }
}
