package TEMA_1.NIVEL3_2.Commands;

import TEMA_1.NIVEL3_2.Vehicles.Vehicle;

public class AccelerateCommand implements Command {
    private Vehicle vehicle;

    public AccelerateCommand(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    @Override
    public void execute() {
        vehicle.accelerate();
    }
}
