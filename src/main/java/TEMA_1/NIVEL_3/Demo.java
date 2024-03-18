package TEMA_1.NIVEL_3;

import TEMA_1.NIVEL_3.Commands.AccelerateCommand;
import TEMA_1.NIVEL_3.Commands.BrakeCommand;
import TEMA_1.NIVEL_3.Commands.StartCommand;
import TEMA_1.NIVEL_3.Vehicles.*;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {
    private static Scanner scanner;
    private static final Parking parking = new Parking(new HashMap<>());

    public Demo(Scanner scanner) {
        this.scanner = scanner;
        addVehicles();


    }

    public void addVehicles() {
        Bike bike = new Bike("Bici");
        Car car = new Car("Coche");
        Plane plane = new Plane("Avion");
        Ship ship = new Ship("Barco");

        parking.addVehicle(1, bike);
        parking.addVehicle(2, car);
        parking.addVehicle(3, plane);
        parking.addVehicle(4, ship);
    }

    public void start() {
        System.out.println("Selecciona el vehiculo o pulsa 0 para salir.");

        int option = 0;
        do {
            showVehicles();
            option = scanner.nextInt();
            switch (option) {
                case 1:
                    showCommands(parking.getVehicle(1));
                    break;
                case 2:
                    showCommands(parking.getVehicle(2));
                    break;
                case 3:
                    showCommands(parking.getVehicle(3));
                    break;
                case 4:
                    showCommands(parking.getVehicle(4));
                    break;
                case 0:
                    System.out.println("GoodByeee");
                    break;
                default:
                    System.out.println("Invalid option");
            }
        } while (option != 0);

    }

    private void showVehicles() {

        System.out.println("Vehículos disponibles:");
        int size = parking.getSize();

        for (int i = 1; i <= size; i++) {
            Vehicle vehicle = parking.getVehicle(i);
            System.out.println(i + ") " + vehicle.getName());
        }
    }

    private Vehicle getVehicle(Integer key) {
        return parking.getVehicle(key);
    }

    private void showCommands(Vehicle vehicle) {
        System.out.println("Comandos para " + vehicle.getName() + ":");
        System.out.println("1. Arrancar");
        System.out.println("2. Acelerar");
        System.out.println("3. Detener");
        int option = scanner.nextInt();
        scanner.nextLine();
        switch (option) {
            case 1:
                parking.execute(new StartCommand(vehicle));
                break;
            case 2:
                parking.execute(new AccelerateCommand(vehicle));
                break;
            case 3:
                parking.execute(new BrakeCommand(vehicle));
        }
    }
}
