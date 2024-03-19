package TEMA_2.Observer;

public class Broker implements Observer {
    @Override
    public void marketRise() {
        System.out.println("Shares of JavaNFT company have surged.");
    }

    public void marketDecline(){
        System.out.println("The stocks of JavaNFT company have plummeted.");
    }
}
