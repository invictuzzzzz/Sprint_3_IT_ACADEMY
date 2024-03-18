package TEMA_1.NIVEL_3.Vehicles;

public class Ship implements Vehicle{

    private String name;

    public Ship(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Encendiendo motor del barco");

    }

    @Override
    public void accelerate() {
        System.out.println("Barco a toda vela!");

    }

    @Override
    public void brake() {
        System.out.println("Frenando el barcooooo");

    }
}
