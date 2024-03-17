package TEMA_1.NIVEL3_2.Commands;

import TEMA_1.NIVEL3_2.Vehicles.Vehicle;

public class StartCommand implements Command {
    private Vehicle vehicle;

    public StartCommand(Vehicle vehicle) {

        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.start();
    }
}
