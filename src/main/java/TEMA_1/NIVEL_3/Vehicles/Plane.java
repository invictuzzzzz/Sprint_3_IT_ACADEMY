package TEMA_1.NIVEL_3.Vehicles;

public class Plane implements Vehicle{

    private String name;

    public Plane(String name) {
        this.name = name;
    }
    @Override
    public String getName() {
        return name;
    }

    @Override
    public void start() {
        System.out.println("Arrancando motores!");
    }

    @Override
    public void accelerate() {
        System.out.println("Avion a toda potencia");

    }

    @Override
    public void brake() {
        System.out.println("Abriendo flips para bajar velocidad.");

    }
}
