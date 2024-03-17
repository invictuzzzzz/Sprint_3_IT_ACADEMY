package TEMA_1.NIVEL_3.Vehicles;

public class Vehicle {
    private String name;

    public Vehicle(String name) {
        this.name = name;
    }

    public void start(){
        System.out.println(name + " started.");
    }

    public void accelerate() {
        System.out.println(name + " accelerate.");
    }

    public void brake() {
        System.out.println(name + " stopped.");
    }
}
