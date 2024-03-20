package TEMA_2.NIVEL_2;

import java.util.Scanner;

public class Demo {

    private Scanner scanner;
    ShoeStore shoeStore = ShoeStore.getInstance();
    Shoes shoes = new Shoes();


    public Demo(Scanner scanner){
        this.scanner = scanner;
    }
    public void showMenu() {
        System.out.println("Welcome to " + shoeStore.getStoreName()
                + ". \nWhat you wanna buy? ");
        shoes.showShoes();
        String option = optionStringClient();
        if(shoes.selectShoe(option)) {
            payMenu();
            int optionMethod = optionIntClient();
            shoeStore.processMethod(optionMethod);
        }
    }

    private String optionStringClient() {
        return scanner.nextLine();
    }
    private int optionIntClient() {
        return scanner.nextInt();
    }

    private void payMenu() {
        System.out.println("Choose a option to pay. \n" +
                "1. Credit Card.\n" +
                "2. Paypal.\n" +
                "3. Bank transfer.");
    }
}



