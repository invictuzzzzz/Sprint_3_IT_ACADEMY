package TEMA_2.NIVEL_2;

import java.util.HashMap;
import java.util.Map;

public class Shoes {
    static public Map<String, Integer> products = new HashMap<>();

    public Shoes() {

        products.put("Bamba", 89);
        products.put("Bota", 60);
        products.put("Sandalia", 25);
    }


    public boolean selectShoe(String option) {
        for (Map.Entry<String, Integer> shoe : products.entrySet()) {
            if (shoe.getKey().equalsIgnoreCase(option)) {
                System.out.println("You choose " + option + "\n" +
                        "Select PayMethod to pay " + shoe.getValue() + "€.");
                return true;
            }
        }
        System.out.println("Dont have that product in Stock.");
    return false;
    }

    public void showShoes() {
        products.forEach((shoe, price) -> System.out.println("Shoe: " + shoe + ", Price: " + price + " €."));
    }
}