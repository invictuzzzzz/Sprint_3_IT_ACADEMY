package TEMA_1.NIVEL3_2;



import TEMA_1.NIVEL3_2.Vehicles.Vehicle;

import java.util.List;

public class Demo {
    Parking parking;
    Scanner scanner;

    Demo(Parking parking){
        this.parking = parking;
    }

    void start(){
        System.out.println("Selecciona el vehiculo");
        showVehicles();
    }

    private void showVehicles(){
        List<Vehicle> vehicles = parking.getVehicles();

        for (int i = 0; i < vehicles.size(); i++) {
            Vehicle vehicle = vehicles.get(i);
            System.out.println(i + 1 + ") " + vehicle.getName());
        }
    }


}
