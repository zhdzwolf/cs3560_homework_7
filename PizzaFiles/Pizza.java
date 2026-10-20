package PizzaFiles;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private final String chain;
    private final String size;
    private final List<String> toppings;

    public Pizza(String chain, String size, List<String> toppings) {
        this.chain = chain;
        this.size = size;
        this.toppings = new ArrayList<>(toppings);
    }

    public void eat() {
        System.out.println("PizzaFiles.Pizza Chain: " + chain);
        System.out.println("Size: " + size);
        System.out.println("Toppings:");

        if (toppings.isEmpty()) {
            System.out.println("  No toppings");
        } else {
            for (String topping : toppings) {
                System.out.println("  - " + topping);
            }
        }

        System.out.println("Enjoy your pizza!\n");
    }
}
