package TEMA_1.NIVEL_3;

import TEMA_1.NIVEL_3.Commands.Command;
import TEMA_1.NIVEL_3.Vehicles.Vehicle;

import java.util.HashMap;

public class Parking {

    private HashMap<Integer, Vehicle> vehicles;

    public Parking(){}

    public Parking(HashMap< Integer, Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public void addVehicle(int key, Vehicle vehicle) {
        vehicles.put(key, vehicle);
    }

    public HashMap<Integer, Vehicle> getVehicles() {
        return vehicles;
    }
    public Vehicle getVehicle(int key) {
        return vehicles.get(key);
    }


    public int getSize(){
        int size = 0;
        if (vehicles.isEmpty()) {
            System.out.println("No hay vehiculos dentro del map");
        } else {
            size = vehicles.size();
        }
        return size;
    }

    void execute(Command command) {
        command.execute();
    }
}
