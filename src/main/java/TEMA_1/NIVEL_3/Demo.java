package TEMA_1.NIVEL_3;

import TEMA_1.NIVEL_3.Commands.AccelerateCommand;
import TEMA_1.NIVEL_3.Commands.BrakeCommand;
import TEMA_1.NIVEL_3.Commands.StartCommand;
import TEMA_1.NIVEL_3.Interfaces.Command;
import TEMA_1.NIVEL_3.ParkingManager.ParkingManager;
import TEMA_1.NIVEL_3.Vehicles.Vehicle;

import java.util.HashMap;
import java.util.Scanner;

public class Demo {
    private static Scanner scanner;
    private static final ParkingManager manager = new ParkingManager(new HashMap<>());

    public Demo(Scanner scanner) {
        this.scanner = scanner;
        addVehicles();
    }

    private void addVehicles() {
        createVehicle("Car");
        createVehicle("Bike");
        createVehicle("Plane");
        createVehicle("Ship");
    }

    private void createVehicle(String vehicleName) {
        Vehicle vehicle = new Vehicle(vehicleName);
        Command startCommand = new StartCommand(vehicle);
        Command accelerateCommand = new AccelerateCommand(vehicle);
        Command brakeCommand = new BrakeCommand(vehicle);

        manager.addCommand("start" + vehicleName, startCommand);
        manager.addCommand("accelerate" + vehicleName, accelerateCommand);
        manager.addCommand("brake" + vehicleName, brakeCommand);
    }

    public void showMenu() {

        int option = 0;

        while (option != 5) {

            System.out.println("Choose a vehicle :");
            System.out.println("1. Car");
            System.out.println("2. Bike");
            System.out.println("3. Plane");
            System.out.println("4. Ship");
            System.out.println("5. Exit");

            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case 1:
                    showCommands("Car");
                    break;
                case 2:
                    showCommands("Bike");
                    break;
                case 3:
                    showCommands("Plane");
                    break;
                case 4:
                    showCommands("Ship");
                    break;
                case 5:
                    System.out.println("GoodBye!");
                default:
                    System.out.println("Opción no válida.");
                    break;
            }
        }
    }

    private void showCommands(String vehicleName) {

        System.out.println("Commands operative for " + vehicleName + ":");
        System.out.println("1. Start");
        System.out.println("2. Accelerate");
        System.out.println("3. Stop");

        int option = scanner.nextInt();
        scanner.nextLine();

        String commandKey = "";

        switch (option) {
            case 1:
                commandKey = "start" + vehicleName;
                break;
            case 2:
                commandKey = "accelerate" + vehicleName;
                break;
            case 3:
                commandKey = "brake" + vehicleName;
                break;
            default:
                System.out.println("Option not valid.");
                return;
        }

        Command command = manager.getCommand(commandKey);
        if (command != null) {
            manager.executeCommand(commandKey);
        } else {
            System.out.println("Not found the command");
        }
    }
}
