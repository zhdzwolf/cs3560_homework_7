package PizzaFiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PizzaBuilder {
    private String chain;
    private String size;
    private final List<String> toppings = new ArrayList<>();

    private static final List<String> AVAILABLE_TOPPINGS =
            Arrays.asList(
                    "Pepperoni",
                    "Sausage",
                    "Mushrooms",
                    "Bacon",
                    "Onions",
                    "Extra Cheese",
                    "Peppers",
                    "Chicken",
                    "Olives",
                    "Spinach",
                    "Tomato and Basil",
                    "Beef",
                    "Ham",
                    "Pesto",
                    "Spicy Pork",
                    "Ham and Pineapple"
            );

    private static final List<String> CHAINS =
            Arrays.asList(
                    "PizzaFiles.Pizza Hut",
                    "Little Caesars",
                    "Dominos"
            );

    public PizzaBuilder chooseChain(String chain) {
        if (chain == null ||
                !(chain.equals("PizzaFiles.Pizza Hut")
                || chain.equals("Little Caesars")
                || chain.equals("Dominos"))) {
            throw new IllegalArgumentException(
                    "Choose from one of the three available chains"
            );
        }

        this.chain = chain;
        return this;
    }

    public PizzaBuilder setSize(String size) {
        if (size == null ||
                !(size.equalsIgnoreCase("Small")
                || size.equalsIgnoreCase("Medium")
                || size.equalsIgnoreCase("Large"))) {
            throw new IllegalArgumentException(
                    "Invalid size"
            );
        }

        this.size = size;
        return this;
    }

    public PizzaBuilder addTopping(String topping) {
        if (topping == null ||
                !AVAILABLE_TOPPINGS.contains(topping)) {
            throw new IllegalArgumentException(
                    "Invalid topping"
            );
        }

        toppings.add(topping);
        return this;
    }

    public Pizza build() {
        if (size == null) {
            throw new IllegalArgumentException(
                    "PizzaFiles.Pizza size is must be set before building."
            );
        }

        return new Pizza(chain, size, toppings);
    }
}
