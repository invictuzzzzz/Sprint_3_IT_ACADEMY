package TEMA_1.NIVEL_1;

import java.util.Deque;
import java.util.LinkedList;

public class Undo {
    private static Undo instance;
    private final Deque<String> orderList;

    private Undo() {
        orderList = new LinkedList<>();
    }

    public static Undo getInstance() {
        if (instance == null) {
            instance = new Undo();
        }
        return instance;
    }

    public void addOrder(String order) {
        orderList.addFirst(order);
        System.out.println("Article " + order + " added to the list.");
    }

    public void removeLastOrder() {
        String response;
        if (orderList.isEmpty()) {
            response = "Nothing to remove";
        } else {
            response = orderList.getFirst() + " removed.";
            orderList.removeFirst();
        }
        System.out.println(response);
    }

    public void showLastOrders() {
        for (String order : orderList) {
            System.out.println(order);
        }
    }
}
