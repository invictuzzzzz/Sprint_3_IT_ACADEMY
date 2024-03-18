package TEMA_1.NIVEL_3.Vehicles;

public class Bike implements Vehicle {
    private String name;

    public Bike(String name){
        this.name = name;
    }

    @Override
    public String getName(){
        return name;
    }

    @Override
    public void start() {
        System.out.println("Empezando a pedalear");
    }

    @Override
    public void accelerate() {
        System.out.println("Pedaleando mas fuerte");

    }

    @Override
    public void brake() {
        System.out.println("Frenando bici");

    }
}
