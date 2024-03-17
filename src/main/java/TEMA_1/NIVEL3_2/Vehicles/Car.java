package TEMA_1.NIVEL3_2.Vehicles;

public class Car implements Vehicle {
    private String name;

    public Car(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void start() {
        System.out.println("Arrancando motor coche");
    }

    @Override
    public void accelerate() {
        System.out.println("Acelerando motor coche");

    }

    @Override
    public void brake() {
        System.out.println("Frenando coche");
    }
}
