package TEMA_2.NIVEL_1.Observable;


public class StockBroker implements Observer {

    private String name;

    public StockBroker(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void marketRise() {
        System.out.println("Las acciones de Amazon han subido un 13%");
    }

    @Override
    public void marketDecline() {
        System.out.println("Las acciones de Amazon se desploman un 4%");
    }
}
