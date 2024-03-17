package TEMA_1.NIVEL_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Undo undo = Undo.getInstance();

        OrderManager orderManager = new OrderManager(scanner, undo);

        orderManager.start();

    }
}
