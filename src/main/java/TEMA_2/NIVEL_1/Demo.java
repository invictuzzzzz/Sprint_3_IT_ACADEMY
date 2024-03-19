package TEMA_2.NIVEL_1;

import TEMA_2.NIVEL_1.Observable.Observer;
import TEMA_2.NIVEL_1.Observable.StockBroker;
import TEMA_2.NIVEL_1.Observer.Broker;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    private static Scanner scanner;
    private Broker broker = new Broker("Dani");
    private StockBroker agencyNY = new StockBroker("Agency NewYork");
    private StockBroker agencyLondon = new StockBroker("Agency London");
    private StockBroker agencyBerlin = new StockBroker("Agency Berlin");
    private ArrayList<StockBroker> stockBrokerList = new ArrayList<>();


    public Demo(Scanner scanner) {
        this.scanner = scanner;

    }

    public void startMenu() {

        int option = 0;

        do {
            printMenu();
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    addAgencys();
                    showTotalAgencys();
                    break;
                case 2:
                    showAgencys();
                    break;
                case 3:
                    addAgencySub();
                    break;
                case 4:
                    showAgencys();
                    System.out.println("Indica el numero de la agencia a eliminar");
                    int agecy = scanner.nextInt();
                    dropAgency(agecy);
                    break;
                case 5:
                    broker.notifyObservableMarketRise();
                    break;
                case 6:
                    broker.notifyObservableMarketDecline();
                    break;
                case 7:
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Opción invalida.");
            }
        } while (option != 7);
    }

    private void printMenu() {

        System.out.println("\nBienvenido al sistema de notificación de Bolsa.\n" +
                "1. Ver todas las agencias.\n" +
                "2. Ver Agencias Subscritas al servicio.\n" +
                "3. Añadir Agencias al servicio de subcripción." +
                "4. Dar de baja una de las agencias del servicio.\n" +
                "5. Hacer subir la bolsa!\n" +
                "6. Hacer bajar la bolsa!.\n" +
                "7. Salir.");
    }

    private void addAgencys() {
        stockBrokerList.add(agencyNY);
        stockBrokerList.add(agencyLondon);
        stockBrokerList.add(agencyBerlin);
    }
    private void addAgencySub() {
        showTotalAgencys();
        System.out.println("Que agencia quieres inscribir al servicio?");
        int option = scanner.nextInt();
        Observer observer = stockBrokerList.get(option-1);
        broker.addObservable(option,observer);
    }

    private void dropAgency(int key) {
        broker.deleteObservableByKey(key);
    }

    private void showTotalAgencys() {
        for (int i = 0; i < stockBrokerList.size(); i++) {
            StockBroker stockBroker = stockBrokerList.get(i);
            System.out.println(i + 1 + ") " + stockBroker.getName());
        }
    }

    private void showAgencys() {
        System.out.println("Agencias subcritas al notificador del Broker " + broker.getName() + ":");
        broker.showObservables();

    }
}
