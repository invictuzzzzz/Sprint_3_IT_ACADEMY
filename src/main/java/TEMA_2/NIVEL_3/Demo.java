package TEMA_2.NIVEL_3;

import java.util.ArrayList;
import java.util.Scanner;

public class Demo {

    private ConverterDI converter;
    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Product> products = new ArrayList<>();

    public Demo(ConverterDI converter) {
        this.converter = converter;
    }


    public void start() {
        System.out.println(
                "Welcome to MediaMarkt. See our products.");
        showProducts();
        priceConvert();

    }

    public void priceConvert() {

        int option = showMenu();
        scanner.nextLine();
        double price = 0.0;
        switch (option) {
            case 1:
                price = convertDivise(products.get(0).getPrice(), "USD");
                System.out.println(products.get(0).getName() + " in USD is " + price);
                break;
            case 2:
                price = convertDivise(products.get(1).getPrice(), "JPY");
                System.out.println(products.get(1).getName() + " in JPY is " + price);
                break;
            case 3:
                price = convertDivise(products.get(2).getPrice(), "CHF");
                System.out.println(products.get(2).getName() + " in CHF is " + price);
                break;
            case 4:
                price = convertDivise(products.get(3).getPrice(), "GBP");
                System.out.println(products.get(3).getName() + " in GBP is " + price);
                break;
            case 5:
                System.out.println("Goodbye!");

        }
    }

    public double convertDivise(double price, String coin) {

        return converter.convert(price, coin);
    }

    private int showMenu() {
        System.out.println("See the price in the nexts Coins.\n" +
                "1. USD.\n" +
                "2. JPY.\n" +
                "3. CHF.\n" +
                "4. GBP.\n" +
                "5. Exit.\n" +
                "Choose the 1 - 5 with number. ");
        return scanner.nextInt();
    }


    private void showProducts() {
        addProducts();
        for (Product product : products) {
            System.out.println(product.getName() + " with a price of " + product.getPrice() + "€.");
        }
    }

    private void addProducts() {

        Product ps5 = new Product("PlayStation", 499);
        Product xbox = new Product("Xbox", 450);
        Product nintendo = new Product("Switch", 99);
        Product pc = new Product("PcGamer", 3425);

        products.add(ps5);
        products.add(xbox);
        products.add(nintendo);
        products.add(pc);

    }
}
