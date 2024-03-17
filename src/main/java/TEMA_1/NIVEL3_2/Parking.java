package TEMA_1.NIVEL3_2;


import TEMA_1.NIVEL3_2.Commands.Command;
import TEMA_1.NIVEL3_2.Vehicles.Vehicle;

import java.util.List;

public class Parking {
    private List<Vehicle> vehicles;

    Parking( List<Vehicle> vehicles ){
        this.vehicles = vehicles;
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    void execute(Command command){
        command.execute();
    }
}
