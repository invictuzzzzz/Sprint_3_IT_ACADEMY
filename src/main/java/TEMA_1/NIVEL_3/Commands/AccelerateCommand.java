package TEMA_1.NIVEL_3.Commands;

import TEMA_1.NIVEL_3.Interfaces.Command;
import TEMA_1.NIVEL_3.Vehicles.Vehicle;

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
