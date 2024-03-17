package TEMA_1.NIVEL3_2;

import TEMA_1.NIVEL3_2.Commands.AccelerateCommand;
import TEMA_1.NIVEL3_2.Commands.BrakeCommand;
import TEMA_1.NIVEL3_2.Commands.StartCommand;
import TEMA_1.NIVEL3_2.Vehicles.Bike;
import TEMA_1.NIVEL3_2.Vehicles.Car;

import java.util.List;


public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike("Bici");
        Car car = new Car("Coche");

        Parking parking = new Parking(List.of(bike, car));

        Demo demo = new Demo(parking);
        demo.start();

    }
}
