package TEMA_1.NIVEL_1;

import java.util.Scanner;

public class OrderManager {
    static Scanner scanner;
    private Undo undo;


    public OrderManager(Scanner scanner, Undo undo) {
        this.scanner = scanner;
        this.undo = undo;
    }


    void start() {
        byte option;
        do {

            option = taskList();
            switch (option) {
                case 1:
                    undo.addOrder(askOrder());
                    break;
                case 2:
                    undo.removeLastOrder();
                    break;
                case 3:
                    undo.showLastOrders();
            }
        } while (option != 4);

    }


    private String askOrder() {
        System.out.print("What do you want to add to the order? ");
        String response = scanner.nextLine();
        return response;
    }

    private byte taskList() {
        System.out.print(
                "1. Add products to the order.\n" +
                        "2. Undo last products from the order.\n" +
                        "3. Show the last products from order list.\n" +
                        "4. Exit\n" +
                        "Option?   - ");
        byte option = scanner.nextByte();
        scanner.nextLine();
        return option;
    }
}
