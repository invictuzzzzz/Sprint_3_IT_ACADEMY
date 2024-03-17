package TEMA_1.NIVEL3_2.Commands;

import TEMA_1.NIVEL3_2.Vehicles.Vehicle;

public class BrakeCommand implements Command {

    private Vehicle vehicle;

    public BrakeCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.brake();
    }
}
